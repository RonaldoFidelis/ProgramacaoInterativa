package Exe_Pessoal;
// Programa para ver Sucessor e o Antecessor.
import java.util.Scanner;
public class exe_005 {
	static void ant(int x) {
		int A, B, S;
		
		B = x;
		A = B - 1;
		S = B + 1;
		
		System.out.println("Antecessor de: "+B+" e "+A+", sucessor: "+S);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = ler.nextInt();
		ant(num);
	}

}
