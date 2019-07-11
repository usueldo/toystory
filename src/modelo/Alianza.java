package modelo;

import java.util.ArrayList;

public class Alianza extends Personaje{
	private ArrayList<Personaje> personajes = new ArrayList();
	
	public Alianza (ArrayList<Personaje> personajes) {
		for (Personaje personaje : personajes) {
		    this.agregarPersonaje(personaje);
		}
	}
	
	public void agregarPersonaje(Personaje personaje) {
		personajes.add(personaje);
		
		//Se incrementa el nivel de ataque
		nivelAtaque += personaje.nivelAtaque;
	}

}
