package jogo_da_adivinhacao;

import java.util.Scanner;

public class Modo_futebol {
	public void iniciarmodofutebol() {
		Scanner sc = new Scanner (System.in);
		
		String resp;
		
		do {
			System.out.println("Fui um Grande jogador de futebol nas decadas de 60 e 70");
			resp = sc.nextLine();
			
			if (resp.equalsIgnoreCase("Pelé")) {
				System.out.println("Parabens Voce acertou !");
				break;
			}
			
			System.out.println("Marqui mais de 1000 gols na minha carreira");
			resp = sc.nextLine();
			
			if (resp.equalsIgnoreCase("Pelé")) {
				System.out.println("Parabens Voce acertou !");
				break;
			}
			
			System.out.println("Fui o unico jogador da historia a ganhar 3 copas do mundo");
			resp = sc.nextLine();
			
			if (resp.equalsIgnoreCase("Pelé")) {
				System.out.println("Parabens Voce acertou !");
				break;
			}
			
		} while (true);
		
		
		
		sc.close();
	}

}
