package modelo;

public class Comun extends Marciano {

	private int ataqueRecibido;
	private final int LIMITE_ATAQUE = 10;
	
	public void recibirAtaque(int nivelAtaque) {
			estaEliminado = nivelAtaque >= LIMITE_ATAQUE;
			ataqueRecibido = nivelAtaque;
	}

	public int darMonedas() {
		if(this.fueEliminado()) {
			return (ataqueRecibido / 2);
		}
		return 0;
	}

}
