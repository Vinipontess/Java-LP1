//12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados.

import java.util.Scanner;
import java.lang.Math;
class TP01EX12{
	public static void main (String[] args){
	double raio;
	double altura;
	Scanner scan = new Scanner(System.in);
	System.out.println("Calcular volume do cone em centímetros");
	System.out.println("");
	System.out.println("Digite o raio da base do cone");
	raio = scan.nextDouble();
	System.out.println("Perfeito! agora digite a altura do cone");
	altura = scan.nextDouble();
	double area = 0.3333*3.14*Math.pow(raio, 2)*altura;
	System.out.printf("O volume do seu cone é de aproximadamente " + "%.2f", area);
	System.out.printf("cm");
	
	}
}

// Vinícius Pontes e Eduardo Barbosa