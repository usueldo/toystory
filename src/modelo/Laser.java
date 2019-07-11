package modelo;

public class Laser extends Elemento{

	
	@Override
	public int obtenerNivelAtaque() {
			return dueño.getMetal();
	}

}
