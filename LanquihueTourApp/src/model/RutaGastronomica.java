package model;

public class RutaGastronomica extends ServicioTuristico {
    
 private int numeroDeParadas;   

    public RutaGastronomica(String tipo,String nombre, int duracionHoras, int numeroDeParadas) {
        super(tipo,nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
        
    }
    
 // Métodos getter y setter

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }
    
    
 
    // Método toString para mostrar la información del objeto
 @Override
    public String toString(){
        return super.toString() +
                " | Paradas: " + numeroDeParadas;

}


}
