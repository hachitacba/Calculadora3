/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import presentacion.VentanaCalculadora;
/**
 *
 * @author Aldo
 */
public class Calculos {
    private boolean primero=true;
    private String ultimaOperacion="=";
    private double resultado,mem1;
    VentanaCalculadora ven=new VentanaCalculadora();
    public boolean isPrimero() {
        return primero;
    }

    public void setPrimero(boolean primero) {
        this.primero = primero;
    }

    public String getUltimaOperacion() {
        return ultimaOperacion;
    }

    public void setUltimaOperacion(String ultimaOperacion) {
        this.ultimaOperacion = ultimaOperacion;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getMem1() {
        return mem1;
    }

    public void setMem1(double mem1) {
        this.mem1 = mem1;
    }
    
    
    
    public void calcular(double x) {
        switch (ultimaOperacion) {
            case "+":
                resultado += x;
                break;
            case "-":
                resultado -= x;
                break;
            case "*":
                resultado *= x;
                break;
            case "/":
                resultado /= x;
                break;
            case "=":
                resultado = x;
                break;
            case "C":
                resultado = 0d;
                primero = true;
                break;
            case ".":
                mem1 = Double.parseDouble(ven.getTxtDisplay().getText());
                resultado = Double.parseDouble(mem1 + ".");
                break;
            case "+/-":
                mem1 = Double.parseDouble(ven.getTxtDisplay().getText());
                resultado = mem1 * (-1);
                break;
            default:
                break;
        }
        ven.getTxtDisplay().setText(Double.toString(resultado));
    }

}
