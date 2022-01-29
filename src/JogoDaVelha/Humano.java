//Aqui a classe humano que herda de jogador e sobresrcreve os m�todos jogar da classe m�e

package JogoDaVelha;
import java.util.Scanner;

public class Humano extends Jogador {
	Scanner teclado =  new Scanner(System.in);

	public Humano() {
		super();
			}

/*O metodo jogar do humano ir� receber dois valores, de linha e coluna respectivamente.
Imagino que o usu�rio n�o v� se dar conta de que as colunas e linha de uma matriz n�o s�o;
0, 1, 2. Ent�o fiz um if else para trocar os valores, quando o usu�rio digitar 1 na a matiz ir� receber 0,
e assim por diante.
	*/
	@Override
	public void jogar() {
		System.out.println("Informe a linha que deseja jogar: ");
		this.setHumanoLinha(teclado.nextInt());
		
			if(getHumanoLinha() == 1) {
				this.setHumanoLinha(0);
			}else
			if(getHumanoLinha() == 2) {
				this.setHumanoLinha(1);;
			}else
			
			if(getHumanoLinha() == 3) {
				this.setHumanoLinha(2);;
			}
			else {
				System.out.println("Jogada inv�lida, n�o existe essa linha, escolha outra!");
			}
		
		System.out.println("Informe a coluna que deseja jogar: ");
		this.setHumanoColuna(teclado.nextInt());
		
		if(getHumanoColuna() == 1) {
			this.setHumanoColuna(0);
		}else
		
		if(getHumanoColuna() == 2) {
			this.setHumanoColuna(1);
		}else
		
		if(getHumanoColuna() == 3) {
			this.setHumanoColuna(2);
		}
		else {
			System.out.println("Jogada inv�lida");
		}
	}

}
