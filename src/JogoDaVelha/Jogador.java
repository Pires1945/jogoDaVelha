//Classe Jogador; 
//Aqui tem os métodos para receber as linhas e colunas das classes filhas
// Humano e Computador e métodos abstratos de ambas classes tbm.

package JogoDaVelha;

public abstract class Jogador {
	private int humanoLinha;
	private int humanoColuna;
	private int computadorLinha;
	private int computadorColuna;
	
	public Jogador() {
		super();
	}

	public Jogador(int humanoLinha, int humanoColuna) {
		this.humanoLinha = humanoLinha;
		this.humanoColuna = humanoColuna;
	}

	public int getHumanoLinha() {
		return humanoLinha;
	}

	public void setHumanoLinha(int humanoLinha) {
		this.humanoLinha = humanoLinha;
	}

	public int getHumanoColuna() {
		return humanoColuna;
	}

	public void setHumanoColuna(int humanoColuna) {
		this.humanoColuna = humanoColuna;
	}
	
	public int getComputadorLinha() {
		return computadorLinha;
	}

	public void setComputadorLinha(int computadorLinha) {
		this.computadorLinha = computadorLinha;
	}

	public int getComputadorColuna() {
		return computadorColuna;
	}

	public void setComputadorColuna(int computadorColuna) {
		this.computadorColuna = computadorColuna;
	}

	public abstract void jogar();
	
	
}
