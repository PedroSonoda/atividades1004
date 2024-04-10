package atividade1004;

import java.util.Scanner;

public class funcionario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double bonus;

		System.out.println("Informe seus anos de contribuição na empresa : ");
		bonus= ler.nextInt();
		String msg = bonus > 3 ? "O seu bônus é de 7%": "O seu bônus é de 5%";
		System.out.println(msg);

		}
	
	}

