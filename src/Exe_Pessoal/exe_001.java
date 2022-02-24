package Exe_Pessoal;

// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, 
// meses e dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
// (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

import java.util.Scanner; // Cria o comando leia.

public class exe_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int idade, anos, meses, dias, total;
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		anos = idade;
		meses = anos*12;
		dias = meses/30;
		total = meses*365;
		
		System.out.println("Você tem "+anos+" anos, "+meses+" meses, e "+dias+" dias. Total de dias: "+total);
		
	}

}
