//main
package gestiondenaves;

/**
 *
 * @author frank santos
 */
import java.util.Scanner;
public class GestionDeNaves {
    public static void main(String[] args) {
        
        AgenciaEspacial agencia = new AgenciaEspacial();
        Scanner sc = new Scanner (System.in);
        int opcion;
        
        do {            
            System.out.println("========= menu =========");
            System.out.println("1. agregar nave (Exploracion, Carguero o Crucero Estelar)");
            System.out.println("2. Mostrar todas las naves registradas");
            System.out.println("3. Iniciar mision de exploracion");
            System.out.println("4. Mostrar naves ordenadas por nombre");
            System.out.println("5. Mostrar naves ordenadas por anio de lanzamiento descendente");
            System.out.println("6. Mostrar naves ordenadas por capacidad de tripulación descendente");
            System.out.println("7. Salir del Sistema");
            
            System.out.print("seleccionar una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); //para borrar el enter
            
            switch (opcion) {
                case 1:
                    System.out.print("1. nave de exploracion");
                    System.out.print("2. carguero");
                    System.out.print("1. crucero");
                    System.out.print("selecciona una opcion");
                    
                    int tipo = sc.nextInt(); sc.nextLine();
                    
                    System.out.print("nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("capacidad de tripulacion:");
                    int tripulacion = sc.nextInt();
                    
                    break;
                
                    
                    
                case 2: 
                    agencia.mostrarNaves();
                    break;
                case 3: 
                    agencia.iniciarExploracion();
                    break;
                case 4: 
                    agencia.ordenarPorNombre();
                    break;
                case 5: 
                    agencia.ordenarPorAnio();
                    break;
                case 6: 
                    agencia.ordenarPorCapacidad();
                    break;
                case 7: 
                    System.out.println("saliendo del menu....");
                    break;
                default:
                    System.out.println("opcion invalida");    
                    break;
                    
            }
            
        } while (opcion != 7);
        
            
        
    }
    
}