package modelo;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AlianzaTest {

	@Test
	void test() {
		Juguete woody = new Juguete();
		Elemento palo = new Palo();
		Elemento lazo = new Lazo(5); 
		woody.agregarElemento(palo);

		woody.agregarElemento(lazo); // como no tiene brazo, no me incrementa nivel de ataque
		
		Juguete buzz = new Juguete();
		buzz.agregarBrazos();
		buzz.agregarElemento(palo);
		buzz.agregarElemento(lazo); // como no tiene brazo, no me incrementa nivel de ataque

		Juguete woody2 = new Juguete();
		woody.agregarElemento(lazo);
		
		ArrayList<Personaje> personajes1 = new ArrayList();
		personajes1.add(woody); //Nivel Ataque 10
		System.out.println("woody tiene " + woody.nivelAtaque);
		personajes1.add(buzz);	//Nivel ataque 15
		System.out.println("buzz tiene " + buzz.nivelAtaque);
		Personaje alianza1 = new Alianza(personajes1); //Nivel ataque 25
		System.out.println("alianza1 tiene " + alianza1.nivelAtaque);
		
		ArrayList<Personaje> personajes2 = new ArrayList();
		personajes2.add(woody2); //Nivel ataque 0
		personajes2.add(alianza1); //Nivel ataque 25
		
		Personaje alianza2 = new Alianza(personajes2); //Nivel ataque 25
		System.out.println("alianza2 tiene " + alianza2.nivelAtaque);
		Marciano pepe = new Comun();
		alianza2.atacar(pepe);
		System.out.println("alianza2 tiene " + alianza2.monedas + " monedas");
		assertTrue("Marciano no fue eliminado", pepe.fueEliminado());
	}

}
