package modelo;

import java.util.ArrayList;
import java.util.List;

public class Juguete extends Personaje{
	private ArrayList<Elemento> elementos = new ArrayList();

	private int metal;
	
	public void setMetal(int metal) {
		this.metal = metal;
	}

	private boolean conBrazos;
	
	public void agregarElemento(Elemento elemento) {
		elemento.asignarDueño(this);
		elementos.add(elemento);
		this.actualizarNivelAtaque(elemento);
	}

	public boolean tieneBrazos() {
		return conBrazos;
	}

	public void agregarBrazos() {
		conBrazos = true;
	}

	public int getMonedas() {
		return this.monedas;
	}

	public int getMetal() {
		return this.metal;
	}

}
