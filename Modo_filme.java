package jogo_da_adivinhacao;

import java.util.Scanner;

public class Modo_filme {
	public void iniciarmodofilme() {
		Scanner sc = new Scanner (System.in);
		
		String resp;
		
		do {
			System.out.println("Eu sou um super-herói da Marvel que carrega um escudo indestrutível. Quem sou eu?");
			resp = sc.nextLine();
			
			if (resp.equalsIgnoreCase("Capitão America")) {
				System.out.println("Parabens Voce acertou !");
				break;
			}
			
			System.out.println("Antes de me tornar um super-herói, eu era um jovem franzino que queria lutar na Segunda Guerra");
			resp = sc.nextLine();
			
			if (resp.equalsIgnoreCase("Capitão America")) {
				System.out.println("Parabens Voce acertou !");
				break;
			}
			
			System.out.println("Fui congelado por décadas e despertado no futuro para me tornar um dos líderes dos Vingadores.");
			resp = sc.nextLine();
			
			if (resp.equalsIgnoreCase("Capitão America")) {
				System.out.println("Parabens Voce acertou !");
				break;
			}
			
		} while (true);
		
		
		
		sc.close();
	}

}
