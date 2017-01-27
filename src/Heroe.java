/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Heroe 
{
   //atributo
    private String nombre;
    private int [] listaVidas;  
    private String listaAmigos;
    private String listaEnemigos;
    
    public String getNombre()
    {
        String nombre = "Zeus";
        return nombre;
    }
    
    //metodos
    public String salvarPrincesa ()
    {
        getNombre();
        System.out.println("Salvando a la princesa");
        atacarVillano(10); //en la misma clase se pueden llamar metodos
        System.out.println(nombre + " salvó a la princesa");
        return nombre;
    }
    
    private void atacarVillano(int fuerza)
    {
        System.out.println("Atacando villano");
        System.out.println("con una fuerza de: " + fuerza);
    }
    
    public static void main(String[] args) 
    {
        Heroe miHeroe = new Heroe ();
        
        miHeroe.salvarPrincesa();
    }
}

