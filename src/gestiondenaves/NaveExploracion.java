
package gestiondenaves;



public class NaveExploracion extends Nave{
    
    public enum TipoMision{
        CARTOGRAFÍA , INVESTIGACIÓN , CONTACTO
    }
    
    private  TipoMision tipoMision;
    
    public NaveExploracion (String nombre, int capacidad, int anioDeLanzamiento, TipoMision tipoMision){
        super(nombre, capacidad, anioDeLanzamiento);
        this.tipoMision = tipoMision;
    }
    
    @Override
    public void explorar(){
        System.out.println(nombre + "esta realizando una mision de" + tipoMision);
    }
    
    @Override
    
    public String toString(){
        return super.toString()+ "|tipo:  Exploracion| Mision: " + tipoMision;
    }
}