import java.util.Scanner;

class TP01EX01{
	public static void main(String[] args){

		//1 - Entrar via teclado com a base e a altura de um ret�ngulo, calcular e exibir sua �rea.		

		int altura;
		int base;

		Scanner scan = new Scanner(System.in);
		System.out.println("Calcular a �rea de um ret�ngulo (digite o tamanho em cent�metros)");
		System.out.println("");
		System.out.println("Digite a altura do seu ret�ngulo");
		altura = scan.nextInt();
		System.out.println("Perfeito! Agora digite a base do seu ret�ngulo ");
		base = scan.nextInt();
		int area = altura*base;
		System.out.println("A �rea do seu ret�ngulo � de " + area + "cm");
		
	}
}

// Vin�cius Pontes e Eduardo Barbosa