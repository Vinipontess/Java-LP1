//9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.

import java.util.Scanner;
import java.lang.Math;



public class TP01EX09 {
    public static void main(String[]args) {
        double v1; 
 double v2; 
	
Scanner sc = new Scanner(System.in);

System.out.println("Digite o valor que representa a resistência elétrica:"); 
v1 = sc.nextDouble(); 

System.out.println("Digite o valor que representa a corrente elétrica:"); 
v2 = sc.nextDouble(); 

double v3 = v1*v2;


System.out.println("O valor da tensão elétrica é: " + v3);

    }
}


// EDUARDO BARBOSA E VINICIUS PONTES