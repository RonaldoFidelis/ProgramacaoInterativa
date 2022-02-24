package Exe_Aulas;
import java.util.Scanner;

public class Exe_001_Medias_Condições {
	static Boolean medias(float A, float B, float C) {
		float x, y;
		
		x = A+B+C;
		y = x / 3;
		
		if(y>=7) {
			System.out.println("Aluno aprovado por media.");
		} else if(y>=5){
			System.out.println("Aluno aprovado.");
		}else{
			System.out.println("Aluno reprovado");
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota ");
		float num1 = ler.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float num2 = ler.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		float num3 = ler.nextFloat();
		
		medias(num1,num2,num3);
	}

}
