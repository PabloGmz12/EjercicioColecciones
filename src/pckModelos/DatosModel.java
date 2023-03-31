/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckModelos;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class DatosModel {
    public HashMap MiLista = new HashMap();
    
public void AgregarNuevoValor(String clave, String valor){
    Datos nuevoDato = new Datos(clave, valor);
    this.MiLista.put(clave, valor);
    JOptionPane.showMessageDialog(null, "Valor agregado!");
}
     
}
