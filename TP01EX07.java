//7. Calcular e exibir a m�dia geom�trica de dois valores quaisquer que ser�o digitados.

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

System.out.println("A m�dia geom�trica dos n�meros digitados �: " + mediag);

    }
}


// EDUARDO BARBOSA E VINICIUS PONTES