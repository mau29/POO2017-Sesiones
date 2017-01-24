/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */

//crear un metodo que se llame getNPrimos
//recibe como parametro un entero
//devuelve un arreglo de enteros
public class Numeros 
{
    //atributos
    private int [] primesList;
    private int [] perfectNaturalList;
    
    //metodos
   public int [] getNPrimos (int num)
   {
       return null; //cuerpo del metodo
                    //los arreglos pueden regresar null
   }
   
   public int getPrimeN (int num)
   {
       return 0; //los enteros pueden regresar 0
   }
   
   //reservar espacio para un arreglo
   //como no devuelve nada, se pone void
   public void reservaPrimeList(int num)
   {
       primesList = new int [num];
   }
   
   public void reservaPerfectNaturalList (int num)
   {
       perfectNaturalList = new int [num];
   }
   
    public void LlenarprimesList ()
   {
       System.out.println("El tamaño de primesList es " + primesList.length); //el tamaño total del arreglo lo puedo obtner con el length
   }
   
    public static void main(String[] args) 
    {
        //instancia
        // Numeros x = new Numeros ();
        Numeros x;
        x = new Numeros ();
        
        //ejecutando metodos de clase a traves de una instancia
        x.reservaPrimeList(1000);
        x.reservaPerfectNaturalList(3000);
        x.LlenarprimesList();
        
        
    }
}
