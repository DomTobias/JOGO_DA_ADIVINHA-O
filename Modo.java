package jogo_da_adivinhacao;

import java.util.Scanner;

public class Modo {
    public int iniciarJogo() {  
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo da Adivinhação!");
        System.out.println("1 - História");
        System.out.println("2 - Ciência");
        System.out.println("3 - Musica");
        System.out.println("4 - Futebol");
        System.out.println("5 - Filme");

        System.out.print("Qual modo você quer jogar: ");
        int modo = sc.nextInt();

        System.out.println("Você escolheu o modo: " + modo);
        
        return modo;  
    }
}
