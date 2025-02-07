package jogo_da_adivinhacao;

public class Principal {
    public static void main(String[] args) {
        Modo jogo = new Modo(); 
        int modo = jogo.iniciarJogo(); 

        if (modo == 1) {
        	Modo_de_Historia  historia = new Modo_de_Historia();  
            historia.iniciarHistoria();  
            
        } else if (modo == 2) {
        	Modo_ciencia ciencias = new Modo_ciencia();
        	ciencias.iniciar_ciencias();
        	
        } else if (modo == 3) {
        	Modo_musica musica = new Modo_musica();
        	musica.iniciarmodomusica();
        	
        } else if (modo == 4) {
        	Modo_futebol futebol = new Modo_futebol();
        	futebol.iniciarmodofutebol();
        	
        } else if (modo == 5) {
        	Modo_filme filme = new Modo_filme();
        	filme.iniciarmodofilme();
        	
        } else {
        	System.out.println("Digite Algum Numero Acima");
        }
        
    }
}
