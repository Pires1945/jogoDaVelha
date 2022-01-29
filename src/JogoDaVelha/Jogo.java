/*
 * Aqui na classe Jogo � onde tudo acontece, aqui s�o chamados os m�todos 
 * para os jogadores jogarem, as contagens de pontos e tudo mais.
 */

package JogoDaVelha;

public class Jogo {
	public Humano humano;
	public Computador computador;
	public Tabuleiro tabuleiro;
	private boolean teste;
	private boolean jogo;
	
	public Jogo() {
		super();
	}
	
	public boolean getJogo() {
		return jogo;
	}

	public void setJogo(boolean jogo) {
		this.jogo = jogo;
	}

	public boolean getTeste() {
		return teste;
	}
	
	public void setTeste(boolean teste) {
		this.teste = teste;
	}

	/*
	 * Aqui no m�todo jogar � onde de fato ocorre o jogo, eu preferi por o jogo dentro de um loop
	 * do while, onde s� sai do loop quand tiver um vencedor.
	 * Ap�s o humano jogar as jogadas do computador est�o reunidas em um loop, justamente � cmo fiz para terstar
	 * se a m�quina n�o ir� preencher uma posi��os j� uasada.
	 */
	public void jogar(Humano humano, Computador computador, Tabuleiro tabuleiro) {
		
		do {
			tabuleiro.checaLinha();
			tabuleiro.checaColuna();
			tabuleiro.checaDiagonal();
			
			humano.jogar();
			tabuleiro.jogadaHumano(humano.getHumanoLinha(), humano.getHumanoColuna());
			tabuleiro.checaLinha();
			tabuleiro.checaColuna();
			tabuleiro.checaDiagonal();
			
			do {
				computador.jogar();
				tabuleiro.jogadaComputador(computador.getComputadorLinha(), computador.getComputadorColuna());
				tabuleiro.checaLinha();
				tabuleiro.checaColuna();
				tabuleiro.checaDiagonal();
			} while (tabuleiro.getTeste() != true);	
							
			tabuleiro.visualizar();		
			System.out.println(tabuleiro.getFim());
			
		}while (tabuleiro.getFim() != true);
	}
}
