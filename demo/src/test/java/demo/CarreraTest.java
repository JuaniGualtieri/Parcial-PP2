package demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;

public class CarreraTest {

    @Test
    public void testCarrera() {
        Piloto p = new Piloto("Franco", "Argentina");
        Piloto p1 = new Piloto("Lewis", "Britanico");
        Piloto p2 = new Piloto("Carlos", "Espaniol");
        Piloto p3 = new Piloto("Lando", "Britanico");
        ArrayList<Piloto> pilotos = new ArrayList<>();

        pilotos.add(p);
        pilotos.add(p1);
        pilotos.add(p2);
        pilotos.add(p3);

        Circuito c = new Circuito("Monza", 5793, 57);
        Carrera cr = new Carrera(c, "10/10/2022", pilotos);

        assertEquals("10/10/2022", cr.getFecha());
        assertEquals("Monza", cr.getCircuito().getNombre());
        assertEquals(57, cr.getCircuito().getVueltasCantidad());
        assertEquals(5793, cr.getCircuito().getLongitud());
        assertEquals("Franco", cr.getPilotos().get(0).getNombre());
        assertEquals("Argentina", cr.getPilotos().get(0).getNacionalidad());
        assertEquals("Lewis", cr.getPilotos().get(1).getNombre());
        assertEquals("Britanico", cr.getPilotos().get(1).getNacionalidad());
        assertEquals("Carlos", cr.getPilotos().get(2).getNombre());
        assertEquals("Espaniol", cr.getPilotos().get(2).getNacionalidad());
        assertEquals("Lando", cr.getPilotos().get(3).getNombre());
        assertEquals("Britanico", cr.getPilotos().get(3).getNacionalidad());
    }
}
