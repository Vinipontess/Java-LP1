
//11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.		

import java.util.Scanner;
import java.lang.Math;
class TP01EX11{
	public static void main(String[] args){
	double diametro;
	double area;
	Scanner scan = new Scanner (System.in);
	System.out.println("Calcular área do circulo a partir do diâmetro em centímetros");
	System.out.println("");
	System.out.println("Digite o temanho do diâmetro");
	diametro = scan.nextDouble();
	area = (3.14*Math.pow(diametro, 2))/4;
	System.out.printf("A área do seu circulo é aproximadamente " + "%.2f", area);
	System.out.printf("cm");
	}
}

// Vinícius Pontes e Eduardo Barbosa