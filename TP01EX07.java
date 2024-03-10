//7. Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.

import java.util.Scanner;
import java.lang.Math;



public class TP01EX07 {
    public static void main(String[]args) {
        double v1; 
        double v2;
	
Scanner sc = new Scanner(System.in);

System.out.println("Digite o primeiro valor:"); 
v1 = sc.nextDouble(); 

System.out.println("Digite o segundo valor:"); 
v2 = sc.nextDouble(); 

double v3 = v1 * v2;
double mediag = Math.sqrt(v3);

System.out.println("A média geométrica dos números digitados é: " + mediag);

    }
}


// EDUARDO BARBOSA E VINICIUS PONTES