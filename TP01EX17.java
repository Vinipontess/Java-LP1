//17. Entrar via teclado com dois valores quaisquer X e Y. Calcular e exibir o c�lculo XY (X elevado a Y). Pesquisar as fun��es Exp e Ln.

import java.util.Scanner;
import java.lang.Math;



public class TP01EX17 {
    public static void main(String[]args) {
        double x; 
    double y;

Scanner sc = new Scanner(System.in);

System.out.println("Digite o primeiro valor: "); 
x = sc.nextDouble(); 

System.out.println("Digite o valor pelo qual quer elevar o primeiro:"); 
y = sc.nextDouble(); 

double xy = Math.pow(x,y);

System.out.println("O valor de " + x + " elevado a " + y + " � igual a " + xy);

double exp = Math.exp(xy);

System.out.println("Valor entregue pela fun��o exp sobre o valor " + xy + " = " + exp);

double ln = Math.log(xy);

System.out.println("Valor entregue pela fun��o ln sobre o valor " + xy + " = " + ln);

    }

}


// EDUARDO BARBOSA E VINICIUS PONTES