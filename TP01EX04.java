import java.util.Scanner;
//4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
public class TP01EX04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da base do triângulo: ");
        double base = scan.nextDouble();

        System.out.print("Digite o valor da altura do triângulo: ");
        double altura = scan.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);
    }
}

//Vinícius Pontes e Eduardo Barbosa
