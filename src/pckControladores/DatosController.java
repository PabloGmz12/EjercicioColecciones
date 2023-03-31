/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckControladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pckModelos.DatosModel;
import pckVistas.frmPrincipal;

/**
 *
 * @author umg
 */
public class DatosController implements ActionListener{
    frmPrincipal VistaPrincipal;
    DatosModel ModeloDatos;

    public DatosController(frmPrincipal VistaPrincipal, DatosModel ModeloDatos) {
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloDatos = ModeloDatos;
        
        this.VistaPrincipal.btnIngresar.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnIngresar){
            this.ModeloDatos.AgregarNuevoValor(this.VistaPrincipal.txtClave.getText(),
                    this.VistaPrincipal.txtValor.getText());
        }
    }
}
