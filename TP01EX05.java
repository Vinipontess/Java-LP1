//5. Calcular e exibir o volume de uma esfera a partir do valor de seu di�metro que ser� digitado.
import java.util.Scanner;
import java.lang.Math;
public class TP01EX05 {
public static void main(String[]args) {
double volesf;
double diametro;
Scanner sc = new Scanner(System.in);
System.out.println("Digite o di�metro:"); 
diametro = sc.nextDouble();
double raio = diametro/2;
volesf = (4*3.14*Math.pow(raio,3))/3;
System.out.println("O volume da esf�ra �: " + volesf);
}
}
// EDUARDO BARBOSA E VINICIUS PONTES