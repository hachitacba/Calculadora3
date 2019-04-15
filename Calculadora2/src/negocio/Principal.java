/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import presentacion.VentanaCalculadora;

/**
 *
 * @author Aldo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaCalculadora cal = new VentanaCalculadora();
        cal.setVisible(true);
        cal.setLocation(200, 200);
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }   
        


    private JPanel VentanaCalculadora;

}
