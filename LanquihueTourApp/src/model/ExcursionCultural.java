package model;

public class ExcursionCultural extends ServicioTuristico {
    
    private String lugarHistorico;
    
    public ExcursionCultural(String tipo, String nombre, int duracionHoras, String lugarHistorico) {
        super(tipo, nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
        
    }

     // Métodos getter y setter
    
    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }
    
    // Método toString para mostrar la información del objeto
  
 @Override
    public String toString(){
        return super.toString() +
                " | Lugar Historico: " + lugarHistorico;
        
        
    }
    
    
    
    
}
