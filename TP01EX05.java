//5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
import java.util.Scanner;
import java.lang.Math;
public class TP01EX05 {
public static void main(String[]args) {
double volesf;
double diametro;
Scanner sc = new Scanner(System.in);
System.out.println("Digite o diâmetro:"); 
diametro = sc.nextDouble();
double raio = diametro/2;
volesf = (4*3.14*Math.pow(raio,3))/3;
System.out.println("O volume da esféra é: " + volesf);
}
}
// EDUARDO BARBOSA E VINICIUS PONTES