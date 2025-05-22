
package gestiondenaves;
import java.util.*;

public class AgenciaEspacial {
    
    private List<Nave> naves = new ArrayList<>(); //se crea una lista para las naves
    
    public void agregarNave(Nave nave){
        if (naves.contains(nave)){
            System.out.println("ya existe una nave con ese nombre y anio de lanzamiento");
        } else{
        naves.add((nave));
            System.out.println("nave agregada exitosamente");
    }
   }
    
   public void mostrarNaves(){
       
       naves.forEach(System.out::println);
       
   } 
   
   
   public void iniciarExploracion(){
       for (Nave nave : naves){
           nave.explorar();
       }
}
   public void ordenarPorNombre(){
       Collections.sort(naves, new Comparator<Nave>(){ // se ordena alfabeticamente con comparator
           @Override
           public int compare (Nave n1, Nave n2){
               return n1.getNombre().compareToIgnoreCase(n2.getNombre());
           }        
       });
       mostrarNaves();
   }
    
   public void ordenarPorAnio(){
       Collections.sort(naves); //usa compareTo() de Nave
       mostrarNaves();
   }
   
   public void ordenarPorCapacidad(){
       Collections.sort(naves, new Comparator<Nave>(){
           @Override
           public int compare(Nave n1 , Nave n2){
               return Integer.compare(n2.capacidad, n1.capacidad);
           }
       });
       mostrarNaves();
   }
   
}
