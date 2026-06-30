package data;

import model.ServicioTuristico;
import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;


// Clase encargada de leer los datos
public class GestorServicios {

 public ServicioTuristico crearRutaGastronomicaUno() {
        return new RutaGastronomica("RUTA GASTRONOMICA: ", "City Tour, ", 4, 5);
}
 public ServicioTuristico crearRutaGastronomicaDos() {
        return new RutaGastronomica("RUTA GASTRONOMICA: " ,"Ruta del Salmon, ", 3, 3);
    }
  public ServicioTuristico crearRutaGastronomicaTres() {
        return new RutaGastronomica("RUTA GASTRONOMICA: ", "Ruta de miel y queso, ", 4, 5);
}

    public ServicioTuristico crearPaseoLacustreUno() {
        return new PaseoLacustre("PASEO LACRUSTRE: ", "Lago Todos los Santos, ", 2, "Catamaran");
    }
    
    public ServicioTuristico crearPaseoLacustreDos() {
        return new PaseoLacustre("PASEO LACRUSTRE: ", "Lago Llanquihue, ", 3, "Catamaran Bandurria");
        
}    
    public ServicioTuristico crearPaseoLacustreTres() {
        return new PaseoLacustre("PASEO LACRUSTRE: ", "Bahia de Frutillar, ", 2, "Lancha Turistica");     
              
    }
    
     public ServicioTuristico crearExcursionCulturalUno() {
        return new ExcursionCultural("EXCURSION CULTURAL: ", "Frutillar, ", 6, "Teatro del Lago"); 
        
    }

    public ServicioTuristico crearExcursionCulturalDos() {
        return new ExcursionCultural("EXCURSION CULTURAL: ", "Puerto Varas Patrimonial, ", 2, "Museo Pablo Fierro");
    
     }
    
    public ServicioTuristico crearExcursionCulturalTres() {
        return new ExcursionCultural("EXCURSION CULTURAL: ", "Llanquihue Historico, ", 5, "Museo del Lago Llanquihue y Monumento a los Colones Alemanes");
    
    }    
    
    
    
}

