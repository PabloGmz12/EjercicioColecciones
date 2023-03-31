
import java.util.*;
import pckControladores.DatosController;
import pckModelos.DatosModel;
import pckVistas.frmPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*List MiLista = new ArrayList();
        MiLista.add(10);
        MiLista.add(10.50);
        MiLista.add("Hola mundo!");
        MiLista.add(true);
        System.out.println(MiLista);   
        System.out.println("-----Otra forma de recorrerlo");
        MiLista.forEach(dato->{
            System.out.println(dato);
        });
        System.out.println("---------Otra forma de recorrerlo-------");
        for(Object ListaDatos : MiLista){
            System.out.println(ListaDatos);
        }*/
        
        /*HashSet ListaNormal = new HashSet();
        ListaNormal.add("Lunes");
        ListaNormal.add("Martes");
        ListaNormal.add("Miercoles");
        ListaNormal.add("Jueves");
        ListaNormal.add("Viernes");
        System.out.println(ListaNormal);
        System.out.println("------Usando Lambda-----");
        ListaNormal.forEach(dato->{
            System.out.println(dato);
        });
        ListaNormal.clear();
        System.out.println("-----Imprimir con for abreviado-----");
        for(Object MisDatos: ListaNormal){
            System.out.println(MisDatos);
        }*/
        
        /*HashMap MiLista = new HashMap();
        MiLista.put(502, "Guatemala");
        MiLista.put(503, "El Salvador");
        MiLista.put(504, "Honduras");
        MiLista.put(505, "Nicaragua");
        MiLista.put(506, "Costa Rica");
        MiLista.put(507, "Panamá");
        
        System.out.println(MiLista);
        MiLista.remove(507);
        System.out.println(MiLista);
        
        MiLista.forEach((clave, valor)->{
            System.out.println(clave+" "+valor);
        });*/
        
        frmPrincipal VistaPrincipal = new frmPrincipal();
        DatosModel ModeloDatos = new DatosModel();
        DatosController ControladorDatos = new DatosController(VistaPrincipal, ModeloDatos);
    }  
}
