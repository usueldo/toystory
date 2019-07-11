package modelo;

public abstract class Personaje {
	protected int nivelAtaque = 0;
	protected int monedas;
	
	protected void actualizarNivelAtaque(Elemento elemento) {
		nivelAtaque += elemento.obtenerNivelAtaque();		
	}

	public void atacar(Marciano marciano) {
		marciano.recibirAtaque(nivelAtaque);
		this.recibirMonedas(marciano.darMonedas());
	}

	protected void recibirMonedas(int monedas) {
		this.monedas = monedas;	
	}
}
