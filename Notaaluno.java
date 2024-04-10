package atividade1004;

import java.util.Scanner;

public class Notaaluno {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double nota,nota1,nota2,nota3,soma;

		System.out.println("Informe a primeira nota:");
		nota = ler.nextDouble();

		System.out.println("Informe a segunda nota:");
		nota1 = ler.nextDouble();

		System.out.println("Informe a terceira nota:");
		nota2 = ler.nextDouble();

		System.out.println("Informe a quarta nota:");
		nota3 = ler.nextDouble();

		soma = (nota+nota1+nota2+nota3)/4;

		String msg = soma >= 7 ? "aprovado": "reprovado";
		System.out.println(msg);// Imprime "você está aprovado"

		ler.close();

	}

}
