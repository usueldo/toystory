package modelo;

public abstract class Elemento {
	protected Juguete dueño;
	
	public abstract int obtenerNivelAtaque();

	protected void asignarDueño(Juguete juguete) {
		this.dueño = juguete;
	}
}
