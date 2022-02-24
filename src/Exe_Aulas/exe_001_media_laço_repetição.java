package Exe_Aulas;
import java.util.Scanner;

public class exe_001_media_laço_repetição {
	static boolean medias(double n1, double n2, double n3) {
		float x, y;
		
		x = (float) (n1+n2+n3);
		y = x / 3;
		
		if(y>=7) {
			System.out.println("Sua media foi "+y);
			System.out.println("Aluno aprovado por media.");
		} else if(y>=5){
			System.out.println("Sua media foi "+y);
			System.out.println("Aluno aprovado");
		}else{
			System.out.println("Sua media foi "+y);
			System.out.println("Aluno reprovado");
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		Scanner menu = new Scanner(System.in);
		
		int opcao;
		double n1, n2,n3;
		
		while(true) { 
					
		System.out.print("\n##--Escolha de Resultado--##\n\n");
		System.out.print("|-------------------------------|\n");
		System.out.print("| Opção 1 - Resultado de Média|\n");
		System.out.print("| Opção 2 - Sair              |\n");
		System.out.print("|-------------------------------|\n");
		System.out.print("Digite uma opção: ");
		opcao = menu.nextInt();		
		
		if(opcao==1) {
			
			System.out.print("Digite sua 1° nota: ");
			n1 = leitor.nextDouble();
			
			System.out.print("Digite sua 2° nota: ");
			n2 = leitor.nextDouble();
			
			System.out.print("Digite sua 3° nota: ");
			n3 = leitor.nextDouble();
			
			medias(n1,n2,n3);
			
		} else if(opcao==2) {
				System.out.println("\nAté logo!");
				break;
			}
		}
	}
}	

