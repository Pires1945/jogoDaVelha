package JogoDaVelha;
import java.util.Random;

public class Computador extends Jogador{
	Random computadorLinha = new Random();
	Random computadorColuna = new Random();
	
	public Computador() {
		
	}

/*
 * No computador � um pouco mais simples, o usu�rio n�o ir� ver ent�o 
 * ficar� gerando n�meros randomicos, at� said do la�o.
 */
	
	@Override
	public void jogar() {
		this.setComputadorLinha(computadorLinha.nextInt(3));		
		this.setComputadorColuna(computadorColuna.nextInt(3));		
	}

}
