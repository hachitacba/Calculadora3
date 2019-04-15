/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import negocio.Calculos;

import java.awt.Event;
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI;

/**
 *
 * @author Aldo
 */
public class VentanaCalculadora extends JFrame {

    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorra;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnInvertir;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSuma;
    private javax.swing.JTextField txtDisplay;
    
    private Calculos cal ;
    
    private String mem1, mem2;

    public JTextField getTxtDisplay() {
        return txtDisplay;
    }

    
    public VentanaCalculadora() {
        setTitle("Calculadora 2");
        setLayout(null);
        setSize(350, 380);
        
        cal=new Calculos();

        txtDisplay = new JTextField("0");
        txtDisplay.setHorizontalAlignment(4);
        txtDisplay.setLocation(10, 20);
        txtDisplay.setSize(290, 30);
        txtDisplay.setEditable(false);

        btn7 = new JButton("7");
        btn7.setLocation(10, 60);
        btn7.setSize(50, 40);
        this.getContentPane().add(btn7);
        btn7.addActionListener(new EscuchaNumeros(7));

        btn4 = new JButton("4");
        btn4.setLocation(10, 110);
        btn4.setSize(50, 40);
        this.getContentPane().add(btn4);
        btn4.addActionListener(new EscuchaNumeros(4));
        
        btn1 = new JButton("1");
        btn1.setLocation(10, 160);
        btn1.setSize(50, 40);
        this.getContentPane().add(btn1);
        btn1.addActionListener(new EscuchaNumeros(1));

        btn0 = new JButton("0");
        btn0.setLocation(10, 210);
        btn0.setSize(50, 40);
        this.getContentPane().add(btn0);
        btn0.addActionListener(new EscuchaNumeros(0));

        btn8 = new JButton("8");
        btn8.setLocation(70, 60);
        btn8.setSize(50, 40);
        this.getContentPane().add(btn8);
        btn8.addActionListener(new EscuchaNumeros(8));

        btn5 = new JButton("5");
        btn5.setLocation(70, 110);
        btn5.setSize(50, 40);
        this.getContentPane().add(btn5);
        btn5.addActionListener(new EscuchaNumeros(5));

        btn2 = new JButton("2");
        btn2.setLocation(70, 160);
        btn2.setSize(50, 40);
        this.getContentPane().add(btn2);
        btn2.addActionListener(new EscuchaNumeros(2));

        btnInvertir = new JButton("+/-");
        btnInvertir.setLocation(70, 210);
        btnInvertir.setSize(50, 40);
        this.getContentPane().add(btnInvertir);
        btnInvertir.addActionListener(new EscuchaNumeros(-1));

        btn9 = new JButton("9");
        btn9.setLocation(130, 60);
        btn9.setSize(50, 40);
        this.getContentPane().add(btn9);
        btn9.addActionListener(new EscuchaNumeros(9));

        btn6 = new JButton("6");
        btn6.setLocation(130, 110);
        btn6.setSize(50, 40);
        this.getContentPane().add(btn6);
        btn6.addActionListener(new EscuchaNumeros(6));

        btn3 = new JButton("3");
        btn3.setLocation(130, 160);
        btn3.setSize(50, 40);
        this.getContentPane().add(btn3);
        btn3.addActionListener(new EscuchaNumeros(3));

        btnPunto = new JButton(".");
        btnPunto.setLocation(130, 210);
        btnPunto.setSize(50, 40);
        this.getContentPane().add(btnPunto);
        btnPunto.addActionListener(new EscuchaOrden("."));

        btnDiv = new JButton("/");
        btnDiv.setLocation(200, 60);
        btnDiv.setSize(50, 40);
        this.getContentPane().add(btnDiv);
        btnDiv.addActionListener(new EscuchaOrden("/"));

        btnMulti = new JButton("*");
        btnMulti.setLocation(200, 110);
        btnMulti.setSize(50, 40);
        this.getContentPane().add(btnMulti);
        btnMulti.addActionListener(new EscuchaOrden("*"));

        btnResta = new JButton("-");
        btnResta.setLocation(200, 160);
        btnResta.setSize(50, 40);
        this.getContentPane().add(btnResta);
        btnResta.addActionListener(new EscuchaOrden("-"));

        btnSuma = new JButton("+");
        btnSuma.setLocation(200, 210);
        btnSuma.setSize(50, 40);
        this.getContentPane().add(btnSuma);
        btnSuma.addActionListener(new EscuchaOrden("+"));

        btnBorra = new JButton("C");
        btnBorra.setLocation(270, 60);
        btnBorra.setSize(50, 90);
        this.getContentPane().add(btnBorra);
        btnBorra.addActionListener(new EscuchaOrden("C"));

        btnResultado = new JButton("=");
        btnResultado.setLocation(270, 160);
        btnResultado.setSize(50, 90);
        this.getContentPane().add(btnResultado);
        btnResultado.addActionListener(new EscuchaOrden("="));

        this.getContentPane().add(txtDisplay);

    }

    class EscuchaNumeros implements ActionListener {

        private int num;

        public EscuchaNumeros(int n) {
            num = n;
        }

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
           
            if (cal.isPrimero()) {
                txtDisplay.setText("");
                cal.setPrimero(false); 
            }
            txtDisplay.setText(txtDisplay.getText() + String.valueOf(num));
        }
    }

    class EscuchaOrden implements ActionListener {
        private String signo;
        public EscuchaOrden(String s) {
            signo=s;
        }
        

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            //String operacion=e.getActionCommand();
            cal.setUltimaOperacion(signo);
            cal.calcular(Double.parseDouble(txtDisplay.getText()));
            //ultimaOperacion=operacion;
            //txtDisplay.setText("");
            cal.setPrimero(true);
            
        }

    }

}
