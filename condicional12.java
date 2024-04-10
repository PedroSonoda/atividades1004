package atividade1004;

import java.util.Scanner;

public class condicional12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		int semana;

		System.out.println("Informe o número do dia da semana: ");
		semana= ler.nextInt();


		switch (semana) {
		case 1:System.out.println("o dia da semana é domingo");
		break;


		case 2:
			System.out.println("o dia da semana é segunda");
			break;

		case 3: 
			System.out.println("o dia da semana é terça");
			break;

		case 4:
			System.out.println("o dia da semana é quarta");
			break;

		case 5:
			System.out.println("o dia da semana é quinta");
			break;

		case 6:
			System.out.println("o dia da semana é sexta");
			break;

		case 7:
			System.out.println("o dia da semana é sábado");
			break;

		default:
			System.out.println("Isso  não é um dia na semana");

		}
	ler.close();
	}

}
