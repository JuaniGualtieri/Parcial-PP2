package demo;
import java.util.ArrayList;


public class Equipo {
    public String nombre;
    public ArrayList <Mecanico> mecanicos;
    public Ingeniero ingeniero;
    public ArrayList <Piloto> piloto;

    public Equipo(String nombre, ArrayList <Mecanico> mecanicos, Ingeniero ingeniero, ArrayList <Piloto> piloto){

        setNombre(nombre);
        setMecanicos(mecanicos);
        setIngeniero(ingeniero);
        setPiloto(piloto);

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public ArrayList <Mecanico> getMecanicos(){
        return mecanicos;
    }

    public void setMecanicos(ArrayList <Mecanico> mecanicos){
        this.mecanicos = mecanicos;
    }

    public Ingeniero getIngeniero(){
        return ingeniero;
    }

    public void setIngeniero(Ingeniero ingeniero){
        this.ingeniero = ingeniero;
    }

    public ArrayList <Piloto> getPilotos(){
        return piloto;
    }

    public void setPiloto(ArrayList <Piloto> piloto){
        this.piloto = piloto;
    }
}
