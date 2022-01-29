/*
 * Aqui na classe Jogo é onde tudo acontece, aqui são chamados os métodos 
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
	 * Aqui no método jogar é onde de fato ocorre o jogo, eu preferi por o jogo dentro de um loop
	 * do while, onde só sai do loop quand tiver um vencedor.
	 * Após o humano jogar as jogadas do computador estão reunidas em um loop, justamente é cmo fiz para terstar
	 * se a máquina não irá preencher uma posiçãos já uasada.
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
