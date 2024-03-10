//13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso (em s) que serão digitados.

import java.util.Scanner;
import java.lang.Math;
class TP01EX13{
	public static void main (String[] args){
	double velocidadef; //f = final
	double velocidadei; //i = inicial
	double aceleracao;
	double tempo;
	Scanner scan = new Scanner (System.in);
	System.out.println("Calcular velocidade final a partir da velocidade inicial, aceleração e tempo do percurso");
	System.out.println("");
	System.out.println("Digite a velocidade inicial (m/s)");
	velocidadei = scan.nextDouble();
	System.out.println("Perfeito! agora digite a aceleração (m/s)");
	aceleracao = scan.nextDouble();
	System.out.println("Ok, agora digite o tempo do percurso em segundos");
	tempo = scan.nextDouble();
	velocidadef = (velocidadei*3.6) + (aceleracao*tempo);
	System.out.printf("A velocidade final do seu automóvel é de " + "%.1f", velocidadef);
	System.out.printf(" Km/h");
	}
}

// Vinícius Pontes e Eduardo Barbosa