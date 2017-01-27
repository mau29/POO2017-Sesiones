/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Villano 
{
    //ATRIBUTOS
    private int barraVida;
    private String nombre;
    private int poderAtaque;
    
    //Vida
    public int getbarraVida()
    {
        barraVida = 50;
        return barraVida;
    }
    
    public int VidaVillano;
    {
        getNombre();
        getbarraVida();
        System.out.println("El villano " + nombre + " tiene " + barraVida + " HP de vida");
    }
    
    //nombre
    public String getNombre()
    {
        nombre = "Cronos";
        return nombre;
    }
    
    
    public String nombre()
    {
        getNombre();
        return nombre;
    }
    
    //atacar
    public int getpoderAtaque()
    {
        poderAtaque = 100;
        return poderAtaque;
    }
    
    public int poderAtaque()
    {
        getpoderAtaque();
        return poderAtaque;
    }
    
    private void atacarHeroe()
    {
        //getNombre(nombre);
        getpoderAtaque();
        System.out.println("El villano " + nombre + " ataco al Heroe ");
        System.out.println("Poder de ataque: " + poderAtaque);
        System.out.println("El Heroe murió");
    }
    
    //atrapar princesa
    private void atraparPrincesa(String nombrePrincesa)
    {
        getNombre();
        System.out.println("El villano " + nombre + " atrapó a la Princesa " + nombrePrincesa);
    }
    
    public static void main(String[] args)
    {   
        Villano muajajaja = new Villano ();
        
        muajajaja.nombre();
        muajajaja.atacarHeroe();
        muajajaja.poderAtaque();
        muajajaja.atraparPrincesa("Fiona");
        
    }
    
    
}
