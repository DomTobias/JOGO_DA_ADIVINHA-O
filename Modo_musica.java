package jogo_da_adivinhacao;

import java.util.Scanner;

public class Modo_musica {
	public void iniciarmodomusica() {
		Scanner sc = new Scanner (System.in);
		
		String resp;
		
		do {
			System.out.println("Eu comecei minha carreira ainda muito jovem com meus irmãos no grupo 'The Jackson 5', antes de me tornar um ícone solo. Quem sou eu?.");
			resp = sc.nextLine();
			
			if (resp.equalsIgnoreCase("Michael Jackson")) {
				System.out.println("Parabens Voce acertou !");
				break;
			}
			
			System.out.println("Eu sou o autor do álbum mais vendido de todos os tempos.Quem sou eu?");
			resp = sc.nextLine();
			
			if (resp.equalsIgnoreCase("Michael Jackson")) {
				System.out.println("Parabens Voce acertou !");
				break;
			}
			
			System.out.println("Fui pioneiro em popularizar videoclipes como uma forma de arte, com vídeos icônicos como 'Bad' e 'Beat It'. Quem sou eu?");
			resp = sc.nextLine();
			
			if (resp.equalsIgnoreCase("Michael Jackson")) {
				System.out.println("Parabens Voce acertou !");
				break;
			}
			
		} while (true);
		
		
		
		sc.close();
	}

}
