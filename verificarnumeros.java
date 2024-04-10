package atividade1004;

import java.util.Scanner;

public class verificarnumeros {

	public static void main(String[] args) {
	Scanner ler= new Scanner(System.in);
	
	System.out.println(" Escolha um numero entre 1 a 3 ");
	int numero= ler.nextInt();
	
	switch (numero) {
	case 1:
		System.out.println("O número escolhido foi: 1.");
    break;
	case 2:
		System.out.println("O número escolhido foi: 2.");
		break;
	case 3:
		System.out.println("O número escolhido foi: 3. ");
		break;
		
	
	default:
		System.out.println("O número escolhido é invalido! Digite um número etre 1 a 3");
		}
	ler.close();

	}

}
