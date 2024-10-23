package demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PersonaTest {

    @Test
    public void testPersona() {
        Persona p = new Persona("Max", "Paises Bajos");
        assertEquals("Max", p.getNombre());
        assertEquals("Paises Bajos", p.getNacionalidad());
    }

    @Test
    public void testMecanico() {
        Mecanico m = new Mecanico("Pablo", "Brasil");
        assertEquals("Pablo", m.getNombre());
        assertEquals("Brasil", m.getNacionalidad());
    }

    @Test
    public void testIngeniero() {
        Ingeniero i = new Ingeniero("Andrea", "Italia");
        assertEquals("Andrea", i.getNombre());
        assertEquals("Italia", i.getNacionalidad());
    }

    @Test
    public void testPiloto() {
        Piloto p = new Piloto("Sergio", "Mexico");
        assertEquals("Sergio", p.getNombre());
        assertEquals("Mexico", p.getNacionalidad());
    }
}
