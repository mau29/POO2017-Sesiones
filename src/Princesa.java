/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Princesa 
{
    private String nombre;
    private String vida;
    
    public String getNombre ()
    {
        nombre = "Fiona";
        return nombre;
    }
    
    public String PrincesaAtacada ()
    {
        getNombre();
        System.out.println("La princesa " + nombre + " esta siendo atacada");
        return nombre;
    }
    
    public String PidiendoAuxilio ()
    {
        getNombre();
        System.out.println(nombre + " grita: Auxilioooo!");
        return nombre;
    }
    
    public String Fin ()
    {
        getNombre();
        System.out.println("La princesa " + nombre + " murió");
        return nombre;
    }
    
    public static void main(String[] args)
    {
        Princesa auxilio = new Princesa ();
        
        auxilio.PrincesaAtacada();
        auxilio.PidiendoAuxilio();
        auxilio.Fin();
    }
    
    
    //pidiendo auxilio metodo
}
