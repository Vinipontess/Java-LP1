
//11. A partir do di�metro de um c�rculo que ser� digitado, calcular e exibir sua �rea.		

import java.util.Scanner;
import java.lang.Math;
class TP01EX11{
	public static void main(String[] args){
	double diametro;
	double area;
	Scanner scan = new Scanner (System.in);
	System.out.println("Calcular �rea do circulo a partir do di�metro em cent�metros");
	System.out.println("");
	System.out.println("Digite o temanho do di�metro");
	diametro = scan.nextDouble();
	area = (3.14*Math.pow(diametro, 2))/4;
	System.out.printf("A �rea do seu circulo � aproximadamente " + "%.2f", area);
	System.out.printf("cm");
	}
}

// Vin�cius Pontes e Eduardo Barbosa