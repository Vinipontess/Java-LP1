import java.util.Scanner;

// Feito por Vinícius Pontes Oliva e Eduardo Barbosa

public class TesteData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Inicializar nova data");
            System.out.println("2. Alterar dia");
            System.out.println("3. Alterar mês");
            System.out.println("4. Alterar ano");
            System.out.println("5. Mostrar data (formato dd/mm/aaaa)");
            System.out.println("6. Mostrar data (formato dd/mesPorExtenso/aaaa)");
            System.out.println("7. Verificar se o ano é bissexto");
            System.out.println("8. Dias transcorridos no ano");
            System.out.println("9. Mostrar data atual");
            System.out.println("10. Sair");
            System.out.print("Opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    data = new Data();
                    System.out.println("\nData inicializada: " + data.mostra1());
                    break;
                case 2:
                    System.out.print("Digite o novo dia: ");
                    int d = sc.nextInt();
                    data.entraDia(d);
                    System.out.println("\nNovo dia ajustado: " + data.retDia());
                    break;
                case 3:
                    System.out.print("Digite o novo mês: ");
                    int m = sc.nextInt();
                    data.entraMes(m);
                    System.out.println("\nNovo mês ajustado: " + data.retMes());
                    break;
                case 4:
                    System.out.print("Digite o novo ano: ");
                    int a = sc.nextInt();
                    data.entraAno(a);
                    System.out.println("\nNovo ano ajustado: " + data.retAno());
                    break;
                case 5:
                    System.out.println("\nData no formato dd/mm/aaaa: " + data.mostra1());
                    break;
                case 6:
                    System.out.println("\nData no formato dd/mesPorExtenso/aaaa: " + data.mostra2());
                    break;
                case 7:
                    System.out.println("\nAno " + data.retAno() + " é bissexto? " + data.bissexto());
                    break;
                case 8:
                    System.out.println("\nDias transcorridos até " + data.mostra1() + ": " + data.diasTranscorridos());
                    break;
                case 9:
                    data.apresentaDataAtual();
                    break;
                case 10:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println("\nDeseja sair ou voltar ao menu principal?");
            System.out.println("1. Voltar ao menu principal");
            System.out.println("2. Sair");
            System.out.print("Opção: ");

            int continuar = sc.nextInt();
            if (continuar == 2) {
                System.out.println("Saindo...");
                sc.close();
                return;
            }
        }
    }
}
