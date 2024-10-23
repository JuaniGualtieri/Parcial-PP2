package demo;

public class Circuito {

    private String nombre;
    private int longitud;
    private int vueltasCantidad;

    // Constructor que inicializa el Circuito
    public Circuito(String nombre, int longitud, int vueltasCantidad) {
        this.setNombre(nombre);  
        this.setLongitud(longitud);
        this.setVueltasCantidad(vueltasCantidad);
    }

    // Método getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método setter para asignar el nombre 
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para obtener la longitud
    public int getLongitud() {
        return longitud;
    }

    // Método setter para asignar la longitud
    private void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    // Método getter para obtener la cantidad de vueltas
    public int getVueltasCantidad() {
        return vueltasCantidad;
    }

    // Método setter para asignar la cantidad de vueltas
    private void setVueltasCantidad(int vueltasCantidad) {
        this.vueltasCantidad = vueltasCantidad;
    }
}

