//18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.

import java.util.Scanner;
import java.lang.Math;



public class TP01EX18 {
    public static void main(String[]args) {
        double v1; 
    double v2; 
    double v3; 
    double v4;
    double v5; 
    double v6;

Scanner sc = new Scanner(System.in);

System.out.println("Digite o valor do primeiro produto:"); 
v1 = sc.nextDouble(); 

System.out.println("Digite o valor do segundo produto:"); 
v2 = sc.nextDouble(); 

System.out.println("Digite o valor do terceiro produto:"); 
v3 = sc.nextDouble(); 

System.out.println("Digite o valor do quarto produto:"); 
v4 = sc.nextDouble(); 

System.out.println("Digite o valor do quinto produto:"); 
v5 = sc.nextDouble(); 

double totalprod = v1 + v2 + v3 + v4 + v5;

System.out.println("O valor total da compra é R$: " + totalprod);

System.out.println("Digite o valor dado para efetuar o pagamento:"); 
v6 = sc.nextDouble(); 

if(v6 > totalprod){
    double troco = v6 - totalprod;
        System.out.println("Pagamento efetuado com sucesso");
        System.out.println("O troco é R$: " + troco);

} else if(v6 == totalprod){
    System.out.println("Pagamento efetuado com sucesso");

    } else{
    double resta = totalprod - v6;
        System.out.println("Pagamento indeferido");
        System.out.println("Restam R$: " + resta);

    }

    }

}


// EDUARDO BARBOSA E VINICIUS PONTES