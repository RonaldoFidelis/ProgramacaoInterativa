package Exe_Pessoal;
//Informar um saldo e imprimir o saldo com reajuste de 1%.

import java.util.Scanner;
public class exe_003 {
	static double reajuste(float x){
		Scanner ler = new Scanner(System.in);
		float y;
		double s;
		double z;
		
		y = x;
		z = y * 0.01;
		s = y+z;
		
		System.out.println("Seu salario com reajuste de 1% fica: "+s);
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu salario: ");
		float salario = ler.nextFloat();
		reajuste(salario);
	}

}
