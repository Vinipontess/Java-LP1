//14. Calcular e exibir o volume livre de um ambiente que cont�m uma esfera de raio �r� inscrita em um cubo perfeito de aresta �a�. Os valores de �r � e �a� ser�o digitados.

import java.util.Scanner;
import java.lang.Math;
class TP01EX14{
	public static void main (String[] args){
	double arestac; //c = cubo
	double raio;
	double volumec; //c = cubo
	double volumee; //e = esfera
	double volumel; //l = livre

	Scanner scan = new Scanner(System.in);
	System.out.println("Calcular espa�o livre do ambiente em metros");
	System.out.println("");
	System.out.println("Digite aresta do cubo");
	arestac = scan.nextDouble();
	System.out.println("Perfeito! digite o raio da esfera");
	raio = scan.nextDouble();
	volumec = Math.pow(arestac, 3);
	volumee = (4*3.14*Math.pow(raio,3))/3;
	volumel = volumec - volumee;
	System.out.printf("O volume livre no ambiente � de aproximadamente " + "%.1f", volumel);
	System.out.printf("m");
	
	}
}

// Vin�cius Pontes e Eduardo Barbosa