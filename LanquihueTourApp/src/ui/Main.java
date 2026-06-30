
package ui;
import data.GestorServicios;
import model.ServicioTuristico;
import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

public class Main {

    public static void main(String[] args) {
      
  GestorServicios gestor = new GestorServicios();

        ServicioTuristico servicio1 = gestor.crearRutaGastronomicaUno();
        ServicioTuristico servicio2 = gestor.crearRutaGastronomicaDos();
        ServicioTuristico servicio3 = gestor.crearRutaGastronomicaTres();
        ServicioTuristico servicio4 = gestor.crearPaseoLacustreUno();
        ServicioTuristico servicio5 = gestor.crearPaseoLacustreDos();
        ServicioTuristico servicio6 = gestor.crearPaseoLacustreTres();
        ServicioTuristico servicio7 = gestor.crearExcursionCulturalUno();
        ServicioTuristico servicio8 = gestor.crearExcursionCulturalDos();
        ServicioTuristico servicio9 = gestor.crearExcursionCulturalTres();
                
        System.out.println("=== SISTEMA DE SERVICIOS LLANQUIHUE TOUR === ");
        

        System.out.println(servicio1);
        System.out.println();

        System.out.println(servicio2);
        System.out.println();

        System.out.println(servicio3);
        System.out.println();

        System.out.println(servicio4);
        System.out.println();
        
        System.out.println(servicio5);
        System.out.println();

        System.out.println(servicio6);
        System.out.println();

        System.out.println(servicio7);
        System.out.println();

        System.out.println(servicio8);
        System.out.println();
        
        System.out.println(servicio9);
        System.out.println();     
        
        
} 
}
        
    
    

