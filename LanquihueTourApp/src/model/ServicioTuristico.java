
package model;

public class ServicioTuristico {
    // Atributos de la clase
    private String tipo;
    private String nombre;
     private int duracionHoras;
    
    // Constructor con parámetros
    public ServicioTuristico(String tipo,String nombre, int duracionHoras) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }
    
    // Métodos getter y setter

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    
    
    // Método toString para mostrar la información del objeto 
    
    @Override
    public String toString() {
        return tipo + nombre +
            + duracionHoras + "hrs." ;
        
    }
    
    }
    
    
                
        
    

    
    
    
    

