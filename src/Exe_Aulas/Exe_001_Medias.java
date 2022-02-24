package Exe_Aulas;
import java.util.Scanner;

public class Exe_001_Medias {
	static float medias(float A, float B, float C) {
		float x, y;
		
		x = A+B+C;
		y = x / 3;
		
		System.out.println("A media é "+y);
		return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota ");
		float num1 = ler.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float num2 = ler.nextFloat();
		
		System.out.println("Digite a terceira nota ");
		float num3 = ler.nextFloat();
		
		medias(num1,num2,num3);
	}

}
