import java.util.Scanner;
//4. A partir dos valores da base e altura de um tri�ngulo, calcular e exibir sua �rea.
public class TP01EX04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da base do tri�ngulo: ");
        double base = scan.nextDouble();

        System.out.print("Digite o valor da altura do tri�ngulo: ");
        double altura = scan.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A �rea do tri�ngulo �: " + area);
    }
}

//Vin�cius Pontes e Eduardo Barbosa
