package modelo;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class JugueteTest {

	@Test
	void atacarMarcianoYFueEliminado() {
				Juguete woody = new Juguete();
				Elemento palo = new Palo();
				Elemento lazo = new Lazo(5); 
				woody.agregarElemento(palo);
				woody.agregarElemento(lazo); // como no tiene brazo, no me incrementa nivel de ataque
				Marciano pepe = new Comun();
				woody.atacar(pepe);
				assertTrue("Marciano no fue eliminado", pepe.fueEliminado());
	}
	@Test
	void obtenerMonedasDespuesDeEliminarMarciano() {
				Juguete woody = new Juguete();
				Elemento palo = new Palo(); //Tiene ataque 10
				Elemento lazo = new Lazo(5);  // Tiene ataque 5 si el juguete tiene brazo
				woody.agregarElemento(palo);
				woody.agregarElemento(lazo); // como no tiene brazo, no me incrementa nivel de ataque
				Marciano pepe = new Comun();
				woody.atacar(pepe);
				int cantidadDeMonedasEsperada = 5;
				assertTrue("Marciano no recibio monedas", woody.getMonedas() == cantidadDeMonedasEsperada);
	}

}
