package Exe_Pessoal;
//Fazer um programa que imprima a média aritmética dos números 8,9 e 7. 
//A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.

import java.util.Scanner;
public class exe_002 {
	static String media() {
		Scanner ler = new Scanner(System.in);
				
		float x = (8+9+7)/3;
		float z = (4+5+6)/3;
		float med = (x + z)/2;
		
		System.out.println("A media é: "+med);
		String y = ler.nextLine();
		
		return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		media();
	}

}
