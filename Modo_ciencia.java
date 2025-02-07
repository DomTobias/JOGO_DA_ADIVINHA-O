package jogo_da_adivinhacao;

import java.util.Scanner;

public class Modo_ciencia {
	public void iniciar_ciencias() {
		Scanner sc = new Scanner (System.in);
		
		String resp;
		
		do {
			System.out.println("Fui um físico teórico, conhecido pela minha famosa equação E = mc².");
			resp = sc.nextLine();
			
			if (resp.equalsIgnoreCase("Albert Einstein")) {
				System.out.println("Parabens Voce acertou !");
				break;
			}
			
			System.out.println("Recebi o Prêmio Nobel de Física em 1921.");
			resp = sc.nextLine();
			
			if (resp.equalsIgnoreCase("Albert Einstein")) {
				System.out.println("Parabens Voce acertou !");
				break;
			}
			
			System.out.println("Sou amplamente reconhecido como o homem que revolucionou a física moderna");
			resp = sc.nextLine();
			
			if (resp.equalsIgnoreCase("Albert Einstein")) {
				System.out.println("Parabens Voce acertou !");
				break;
			}
			
		} while (true);
		
		
		sc.close();
	}

}
