package Exe_Pessoal;
//Fazer um programa que imprima a m�dia aritm�tica dos n�meros 8,9 e 7. 
//A m�dia dos n�meros 4, 5 e 6. A soma das duas m�dias. A m�dia das m�dias.

import java.util.Scanner;
public class exe_002 {
	static String media() {
		Scanner ler = new Scanner(System.in);
				
		float x = (8+9+7)/3;
		float z = (4+5+6)/3;
		float med = (x + z)/2;
		
		System.out.println("A media �: "+med);
		String y = ler.nextLine();
		
		return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		media();
	}

}
