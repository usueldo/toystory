package modelo;

public abstract class Elemento {
	protected Juguete due�o;
	
	public abstract int obtenerNivelAtaque();

	protected void asignarDue�o(Juguete juguete) {
		this.due�o = juguete;
	}
}
