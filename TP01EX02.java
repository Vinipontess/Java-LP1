import java.util.Scanner;

class TP01EX02{
	public static void main (String[] args){
		
	//2 - Calcular e exibir a �rea de um quadrado, a partir do valor de sua aresta que ser� digitado.
	
	int lado;
	
	System.out.println("Calcular a �rea do quadrado (Digite o tamanho em cent�metros)");
	System.out.println("");
	System.out.println("Digite o tamanho de um dos lados do seu quadrado");
	Scanner scan = new Scanner(System.in);
	lado = scan.nextInt();
	int area = lado*lado;
	System.out.println("");
	System.out.println("A �rea do seu quadrado � de " + area + "cm");
	}
}

//Vin�cius Pontes e Eduardo Barbosa