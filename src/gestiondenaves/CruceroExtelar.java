
package gestiondenaves;


public class CruceroExtelar extends Nave{
    
    private int cantidadPasajeros;

    public CruceroExtelar(int cantidadPasajeros, String nombre, int capacidad, int anioDeLanzamiento) {
        super(nombre, capacidad, anioDeLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    @Override
    public void explorar(){
        System.out.println(nombre + "no puede participar en misiones de exploracion.");
    }
    
    @Override 
    public String toString(){
        return super.toString()+ "|tipo: crucero estelar | Pasajeros: " + cantidadPasajeros;
    }
}
