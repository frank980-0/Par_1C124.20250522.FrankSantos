
package  gestiondenaves;


public abstract class Nave implements Comparable<Nave>{
    
    protected String nombre;
    protected int capacidad;
    protected int anioDeLanzamiento;

    public Nave(String nombre, int capacidad, int anioDeLanzamiento) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }
    
    public abstract void explorar();
    
     @Override
    public int compareTo(Nave otro){  //mas reciente 1ro
        return Integer.compare(otro.anioDeLanzamiento, this.anioDeLanzamiento);
    }
    
    @Override
    
    public boolean equals (Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Nave)) return false;
        Nave otra = (Nave) obj;
        return this.nombre.equalsIgnoreCase(otra.nombre) && // 
                this.anioDeLanzamiento == otra.anioDeLanzamiento;
    } 
    
    @Override
    
    public int hashCode(){ //se modifica el hashCode si modificamos el equals para no tener error
        return nombre.toLowerCase().hashCode() + Integer.hashCode(anioDeLanzamiento);
    } 
    
    @Override
    
    public String toString(){
        return String.format("Nombre : %s | Tripulacion : %d | Anio : %d",nombre,capacidad,anioDeLanzamiento);
    }
    
}
