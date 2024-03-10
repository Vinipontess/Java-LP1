//15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).

import java.util.Scanner;
import java.lang.Math;
class TP01EX15{
	public static void main (String[] args){
	double real;
	double dolar;
	double cotacao;
	Scanner scan = new Scanner (System.in);
	System.out.println("Converter real para dólar");
	System.out.println("");
	System.out.println("Digite a cotacao do dólar em relação ao real (Quantos reais dão 1 dólar)");
	cotacao = scan.nextDouble();
	System.out.println("Quantos dólares você quer transformar em real?");
	dolar = scan.nextDouble();
	real = dolar*cotacao;
	System.out.println("$" + dolar + " equivale a R$" + real);
	}
}

// Vinícius Pontes e Eduardo Barbosa