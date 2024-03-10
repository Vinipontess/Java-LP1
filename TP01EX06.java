//6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.

import java.util.Scanner;
import java.lang.Math;



public class TP01EX06 {
    public static void main(String[]args) {
        double v1; 
        double v2;
	double v3; 
        double v4;


Scanner sc = new Scanner(System.in);

System.out.println("Digite o primeiro valor:"); 
v1 = sc.nextDouble(); 

System.out.println("Digite o segundo valor:"); 
v2 = sc.nextDouble(); 

System.out.println("Digite o terceiro valor:"); 
v3 = sc.nextDouble(); 

System.out.println("Digite o quarto valor:"); 
v4 = sc.nextDouble(); 

double media = (v1 + v2 + v3 + v4)/4;

System.out.println("A média dos números digitados é: " + media);

    }
}


// EDUARDO BARBOSA E VINICIUS PONTES