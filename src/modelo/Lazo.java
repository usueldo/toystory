package modelo;

public class Lazo extends Elemento{
	private int fuerza;
	
	
	public Lazo(int fuerza) {
		this.fuerza = fuerza;
	}
	
	@Override
	public int obtenerNivelAtaque() {
		if (due�o.tieneBrazos()) {
			return fuerza;
		}
		
		return 0;
	}

}
