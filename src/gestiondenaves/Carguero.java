
package gestiondenaves;

public class Carguero extends Nave{
    
    private int capacidadCarga;

    public Carguero(int capacidadCarga, String nombre, int capacidad, int anioDeLanzamiento) {
        super(nombre, capacidad, anioDeLanzamiento);
        this.capacidadCarga = Math.max(100, Math.min(capacidadCarga, 500));
    }
    
    @Override
    public void explorar(){
        System.out.println(nombre + "esta transportando carga como parte de una mision ");
    }
    
    @Override
    public String toString(){
        return super.toString()+"| tipo: carguero | carga: " + capacidadCarga +"toneladas";
    }
}
