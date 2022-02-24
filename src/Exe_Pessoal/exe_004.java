package Exe_Pessoal;
import java.util.Scanner;

//Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, 
//calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado. (1SM=R$788,00)


public class exe_004 {
	static boolean salario(float x) {
		float SalarioMin, Quantidade;
		
		SalarioMin = 1200;
		
		if(x <= SalarioMin) {
			System.out.println("Voce recebe proporcional a 1 salario minimo.");
		} else if (x > SalarioMin) {
			Quantidade = x / 1200;
			System.out.println("Você recebe proporcional a "+ Quantidade +" salario minimo");
		} else {
			System.out.println("Erro!");
		} 
			return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu salario: ");
		float var = ler.nextFloat();
		salario(var);
	}

}
