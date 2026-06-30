package model;

public class PaseoLacustre extends ServicioTuristico {
    
 private String tipoDeEmbarcacion;
 
 public PaseoLacustre(String tipo,String nombre, int duracionHoras, String tipoDeEmbarcacion) {
        super(tipo,nombre, duracionHoras);         
        this.tipoDeEmbarcacion = tipoDeEmbarcacion;        
    
 }

  // Métodos getter y setter
 
    public String getTipoDeEmbarcacion() {
        return tipoDeEmbarcacion;
    }

    public void setTipoDeEmbarcacion(String tipoDeEmbarcacion) {
        this.tipoDeEmbarcacion = tipoDeEmbarcacion;
    }
 
     // Método toString para mostrar la información del objeto
     @Override
    public String toString(){
        return super.toString() +
                " | Embarcacion: " + tipoDeEmbarcacion;
 
         
}
}
