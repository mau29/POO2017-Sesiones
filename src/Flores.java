/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Flores 
{
    private String tipoFlor;
    private int precio;
    private String olor;

    public String getTipoFlor() {
        return tipoFlor;
    }

    public void setTipoFlor(String tipoFlor) {
        this.tipoFlor = tipoFlor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getOlor() {
        return olor;
    }

    public void setOlor(String olor) {
        this.olor = olor;
    }
    
    public void printFlor()
    {
        System.out.println("Tipo: " + tipoFlor);
        System.out.println("Olor: " + olor);
        System.out.println("Precio: " + precio);
    }
    
}
