/*
 * Na classe tabuleiro é onde é computadas as jogadas e feitas as contagens das linhas e colunas
 */

package JogoDaVelha;

public class Tabuleiro {
	
	public Jogo jogo;
	public Computador computador;
	private boolean ganhouLinha;
	private boolean ganhouColuna;
	private boolean ganhouDiagonal;
	private boolean fim;
	public Humano humano;
	public int mat[][] = new int[3][3];
	private boolean teste;
	
	public Tabuleiro() {
		
		}

	public boolean getFim() {
		return fim;
	}

	public void setFim(boolean fim) {
		this.fim = fim;
	}

	public boolean getGanhouLinha() {
		return ganhouLinha;
	}

	public void setGanhouLinha(boolean ganhouLinha) {
		this.ganhouLinha = ganhouLinha;
	}

	public boolean getGanhouColuna() {
		return ganhouColuna;
	}

	public void setGanhouColuna(boolean ganhouColuna) {
		this.ganhouColuna = ganhouColuna;
	}

	public boolean getGanhouDiagonal() {
		return ganhouDiagonal;
	}

	public void setGanhouDiagonal(boolean ganhouDiagonal) {
		this.ganhouDiagonal = ganhouDiagonal;
	}

	public boolean getTeste() {
		return teste;
	}

	public void setTeste(boolean teste) {
		this.teste = teste;
	}

 // Este é o metodo que recebe as jogadas da classe humano
 
	public void jogadaHumano(int linha, int coluna) {
		mat[linha][coluna] = 1;
	}
	
	/*
	 * Este metodo recebe as jogadas do computador,
	 * aqui tive que por um controle por que a máquina estava marcando em uma posição que já estava
	 * sendo usada pelo humano.
	 * Então criei um teste, para veirifcar se a jogada pode ser feita.
	 * Caso não possa ser feita, na classe jogo esta em um loop do while
	 * que só termina quando a jogada da máquina for válida. 
	 */
	public void jogadaComputador(int linha, int coluna) {
		
		
			if ((mat[linha][coluna] == -1) || (mat[linha][coluna] == 1)) {
				/*System.out.println("Jogada inválida, jogue em outra linha");
				System.out.println("Linha" + linha);
				System.out.println("Coluna" + coluna);*/
				this.setTeste(false);
			}
			else {
				mat[linha][coluna] = -1;
				this.setTeste(true);
			}
	}
	/*
	 * Aqui é a cheagem das linhas, tanto da máquina quando do humano
	 * Sempre depois de uma jogada é feita a contagem.
	 */
	public void checaLinha() {
		for (int linha = 0 ; linha < 3 ; linha++) {
			if ((mat[linha][0] + mat[linha][1] + mat[linha][2]) == 3) {
				setGanhouLinha(true);
				setTeste(true);
				this.fim = true;
				System.out.println("Você ganhou!");
			}
			else if ((mat[linha][0] + mat[linha][1] + mat[linha][2]) == -3) {
				setGanhouLinha(true);
				setTeste(true);
				this.fim = true;
				System.out.println("Você perdeu!");
			} 
			else {
				setGanhouLinha(false);
				this.fim = false;
			}
		}
	}
	//Aqui checa ás colunas
	public void checaColuna() {
		for (int coluna = 0 ; coluna < 3 ; coluna++) {
			if ((mat[0][coluna] + mat[1][coluna] + mat[2][coluna]) == 3) {
				setGanhouColuna(true);
				setTeste(true);
				this.fim = true;
				System.out.println("Você ganhou!");
			}
			else if ((mat[0][coluna] + mat[1][coluna] + mat[2][coluna]) == -3) {
				setGanhouColuna(true);
				setTeste(true);
				this.fim = true;
				System.out.println("Você perdeu!");
			} 
			else {
				setGanhouColuna(false);
				this.fim = false;
			}
		}
	}
	//Aqui checa as linhas
	public void checaDiagonal() {
		if ((mat[0][0] + mat[1][1] + mat[2][2]) == 3) {
			setGanhouDiagonal(true);
			setTeste(true);
			this.fim = true;
			System.out.println("Você ganhou!");
		}
		
		if ((mat[0][2] + mat[1][1] + mat[2][0]) == 3) {
			setGanhouDiagonal(true);
			setTeste(true);
			this.fim = true;
			System.out.println("Você ganhou!");
		}
		
		if ((mat[0][0] + mat[1][1] + mat[2][2]) == -3) {
			setGanhouDiagonal(true);
			setTeste(true);
			this.fim = true;
			System.out.println("Você perdeu!");
		}
		
		if ((mat[0][2] + mat[1][1] + mat[2][0]) == -3) {
			setGanhouDiagonal(true);
			setTeste(true);
			this.fim = true;
			System.out.println("Você perdeu!");
		}
	}
	
	/*
	 * Aqui é a visualização do tabuleiro, ele sempre traz atualizadas as posições.
	 */
	public void visualizar() {
		System.out.println();
		for (int i = 0; i < mat.length; i++) {
			
			for (int j = 0; j < mat.length; j++) {
				
				if(mat[i][j] == 1) {
					System.out.print(" X ");
				} 
					if (mat[i][j] == -1) {
					System.out.print(" O ");
				}  
					if (mat[i][j] == 0) {
					System.out.print(" - ");
				}
				
				if(j == 0 || j == 1) 
					System.out.print("|");
			}
			System.out.println();
		}
		
		
	}
		
}
