/*
 * Aqui no Main � a parte mais simples, 
 * Basta instancias os objetos que o jogo come�a.
 */

package JogoDaVelha;

public class Main {

	public static void main(String[] args) {
		Humano humano = new Humano();
		Computador computador = new Computador();
		Tabuleiro tabuleiro = new Tabuleiro();
		Jogo jogo = new Jogo();
		
		jogo.jogar(humano, computador, tabuleiro);
		
		

	}

}
