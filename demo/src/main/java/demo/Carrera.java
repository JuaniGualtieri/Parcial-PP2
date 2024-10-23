package demo;
import java.util.ArrayList;


public class Carrera {


    public Circuito circuito;
    private String fecha; 
    private ArrayList <Piloto> pilotos;

   public Carrera(Circuito circuito, String fecha, ArrayList <Piloto> pilotos){
    setCircuito(circuito);
    setFecha(fecha);
    setPilotos(pilotos);

   }

   public Circuito getCircuito(){
    return circuito;

   }

   private void setCircuito(Circuito circuito){
    this.circuito = circuito;

   }

   public String getFecha(){
    return fecha;

   } 

   private void setFecha(String fecha){
    this.fecha = fecha;

   }

   public ArrayList <Piloto> getPilotos(){
    return pilotos;
   }

private void setPilotos(ArrayList <Piloto> pilotos){
this.pilotos = pilotos;    
}

}


