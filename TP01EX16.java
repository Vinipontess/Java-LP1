//16. Entrar via teclado com o valor de um �ngulo em graus, calcular e exibir as seguintes fun��es trigonom�tricas: seno, cosseno, tangente e secante deste �ngulo. Lembre-se que uma fun��o trigonom�trica trabalha em radianos.

import java.util.Scanner;
import java.lang.Math;



public class TP01EX16 {
    public static void main(String[]args) {
        double a1; 
Scanner sc = new Scanner(System.in);
System.out.println("Digite o valor do �ngulo: "); 
a1 = sc.nextDouble(); 
 
// Convertendo o �ngulo de graus para radianos
        double rad = Math.toRadians(a1);

// Calculando as fun��es trigonom�tricas
        double seno = Math.sin(rad);
        double cosseno = Math.cos(rad);
        double tangente = Math.tan(rad);

 // Verificando se o cosseno � diferente de zero para evitar divis�o por zero na secante

double secante = (cosseno != 0) ? (1 / cosseno) : Double.POSITIVE_INFINITY;

System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);


    }

}


// EDUARDO BARBOSA E VINICIUS PONTES