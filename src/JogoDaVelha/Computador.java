package JogoDaVelha;
import java.util.Random;

public class Computador extends Jogador{
	Random computadorLinha = new Random();
	Random computadorColuna = new Random();
	
	public Computador() {
		
	}

/*
 * No computador é um pouco mais simples, o usuário não irá ver então 
 * ficará gerando números randomicos, até said do laço.
 */
	
	@Override
	public void jogar() {
		this.setComputadorLinha(computadorLinha.nextInt(3));		
		this.setComputadorColuna(computadorColuna.nextInt(3));		
	}

}
