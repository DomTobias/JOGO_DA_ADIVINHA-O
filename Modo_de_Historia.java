package jogo_da_adivinhacao;

import java.util.Scanner;

public class Modo_de_Historia {
	public void iniciarHistoria() {
		Scanner sc = new Scanner (System.in);
		
		String resp;
		
		do {
			System.out.println("Fui um grande admirador das ciências e cheguei a conhecer o inventor do telefone, Alexander Graham Bell.");
			resp = sc.nextLine();
			
			if (resp.equalsIgnoreCase("Dom Pedro Segundo")) {
				System.out.println("Parabens Voce acertou !");
				break;
			}
			
			System.out.println("Assumi o trono ainda criança, aos 14 anos.");
			resp = sc.nextLine();
			
			if (resp.equalsIgnoreCase("Dom Pedro Segundo")) {
				System.out.println("Parabens Voce acertou !");
				break;
			}
			
			System.out.println("Fui imperador do Brasil por quase 50 anos.");
			resp = sc.nextLine();
			
			if (resp.equalsIgnoreCase("Dom Pedro Segundo")) {
				System.out.println("Parabens Voce acertou !");
				break;
			}
			
		} while (true);
		
		
		
		sc.close();
	}

}
