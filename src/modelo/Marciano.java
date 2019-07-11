package modelo;

public abstract class Marciano {
	protected boolean estaEliminado = false;
	
	public boolean fueEliminado() {
		return estaEliminado;
}

public abstract void recibirAtaque(int nivelAtaque);

public abstract int darMonedas();
}
