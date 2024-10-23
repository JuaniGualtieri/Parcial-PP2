package demo;

public class Persona {

    public String nombre;
    public String nacionalidad;

    public Persona(String nombre, String nacionalidad){
        setNombre(nombre);
        setNacionalidad(nacionalidad);

    }
    
    public String getNombre(){
        return nombre;
    }

    private void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNacionalidad(){
        return nacionalidad;
    }

    private void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
}