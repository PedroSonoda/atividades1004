package atividade1004;

import java.util.Scanner;

public class Messwitchcase {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int mes;

		System.out.println("Informe o número do mês: ");
		mes= ler.nextInt();


		switch (mes) {
		case 1:System.out.println("o mês é janiero");
		break;

		case 2:System.out.println("o mês é fevereiro");
		break;

		case 3:
			System.out.println("o mês é março");
			break;

		case 4:
			System.out.println("o mês é abril");
			break;

		case 5:
			System.out.println("o mês é maio");
			break;

		case 6:
			System.out.println("o mês é junho");
			break;

		case 7:
			System.out.println("o mês é julho ");
			break;

		case 8:
			System.out.println("o mês é agosto ");
			break;

		case 9:
			System.out.println("o mês é setembro ");
			break;

		case 10: 
			System.out.println("o mês é outubro ");
			break;

		case 11:
			System.out.println("o mês é novembro ");
			break;

		case 12:
			System.out.println("o mês é dezembro ");
			break;

		default:
			System.out.println("isso não é um mês");
		}
ler.close();

	}
}