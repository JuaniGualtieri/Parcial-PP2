package demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;

public class EquipoTest {

    @Test
    public void testEquipo() {
        Ingeniero i = new Ingeniero("James", "Reino Unido");
        Piloto p = new Piloto("George", "Reino Unido");
        ArrayList<Piloto> pilotos = new ArrayList<>();
        pilotos.add(p);

        Mecanico me = new Mecanico("Enzo", "Italia");
        Mecanico me2 = new Mecanico("Lucas", "Francia");
        ArrayList<Mecanico> mecanicos = new ArrayList<>();
        mecanicos.add(me);
        mecanicos.add(me2);

        Equipo e = new Equipo("Alpha", mecanicos, i, pilotos);

        assertEquals("Alpha", e.getNombre());
        assertEquals("Enzo", e.getMecanicos().get(0).getNombre());
        assertEquals("Lucas", e.getMecanicos().get(1).getNombre());
        assertEquals("James", e.getIngeniero().getNombre());
        assertEquals("George", e.getPilotos().get(0).getNombre());
    }
}

