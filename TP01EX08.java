//8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e dois metros e que um quilômetro possui mil metros, fazer um programa para converter milhas marítimas em quilômetros.

import java.util.Scanner;
import java.lang.Math;



public class TP01EX08 {
    public static void main(String[]args) {
        double v1; 
	
Scanner sc = new Scanner(System.in);

System.out.println("Digite a quilometragem a ser convertida para milhas náuticas:"); 
v1 = sc.nextDouble(); 

double v2 = v1/1.852;


System.out.println("A quilometragem digitada equivale a : " + v2 + " milhas náuticas");

    }
}


// EDUARDO BARBOSA E VINICIUS PONTES