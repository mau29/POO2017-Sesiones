/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamen;

/**
 *
 * @author Pablo
 */
public class Dona
{   
     private int tipoDona;
    private float precio;
    private String sabor;

    public int getTipoDona() {
        return tipoDona;
    }

    public void setTipoDona(int tipoDona) {
        this.tipoDona = tipoDona;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
   
    
    public void printDona()
    {
        System.out.println("Tipo: " + tipoDona);
        System.out.println("Sabor: " + sabor);
        System.out.println("Precio: " + precio);
    }
}
