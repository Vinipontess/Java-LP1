//15. Entrar via teclado com o valor da cota��o do d�lar e uma certa quantidade de d�lares. Calcular e exibir o valor correspondente em Reais (R$).

import java.util.Scanner;
import java.lang.Math;
class TP01EX15{
	public static void main (String[] args){
	double real;
	double dolar;
	double cotacao;
	Scanner scan = new Scanner (System.in);
	System.out.println("Converter real para d�lar");
	System.out.println("");
	System.out.println("Digite a cotacao do d�lar em rela��o ao real (Quantos reais d�o 1 d�lar)");
	cotacao = scan.nextDouble();
	System.out.println("Quantos d�lares voc� quer transformar em real?");
	dolar = scan.nextDouble();
	real = dolar*cotacao;
	System.out.println("$" + dolar + " equivale a R$" + real);
	}
}

// Vin�cius Pontes e Eduardo Barbosa