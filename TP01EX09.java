//9. Calcular e exibir a tens�o de um determinado circuito eletr�nico a partir dos valores da resist�ncia e corrente el�trica que ser�o digitados. Utilize a lei de Ohm.

import java.util.Scanner;
import java.lang.Math;



public class TP01EX09 {
    public static void main(String[]args) {
        double v1; 
 double v2; 
	
Scanner sc = new Scanner(System.in);

System.out.println("Digite o valor que representa a resist�ncia el�trica:"); 
v1 = sc.nextDouble(); 

System.out.println("Digite o valor que representa a corrente el�trica:"); 
v2 = sc.nextDouble(); 

double v3 = v1*v2;


System.out.println("O valor da tens�o el�trica �: " + v3);

    }
}


// EDUARDO BARBOSA E VINICIUS PONTES