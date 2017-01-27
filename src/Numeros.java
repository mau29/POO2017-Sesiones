/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
import java.lang.Math; //para incluir una libreria/clase

//crear un metodo que se llame getNPrimos
//recibe como parametro un entero
//devuelve un arreglo de enteros
public class Numeros 
{
    //atributos
    private int [] primesList;
    private int [] perfectNaturalList;
    
    //metodos=funciones
    //las librerias se ponen en los metodos
   public int [] getNPrimos (int num)
   {
       return null; //cuerpo del metodo
                    //los arreglos pueden regresar null
   }
   
   public int getPrimeN (int num)
   {
       return 0; //los enteros pueden regresar 0
   }
   
   public int max (int a, int b)
   {
       if(a > b)
       {
           return a;
       }
       else
       {
           return b;
       }
   }
   
   public int min (int a, int b)
   {
       if(a < b)
       {
           return a;
       }
       else
       {
           return b;
       }
   }
   
   public double potencia (double num, double pot) //pot=potencia
   {
       return Math.pow(num, pot);
   }
   
   public int valorAbsoluto (int num)
   {
       if(num<0)
       {
           return (num*-1);
       }
       else
       {
           return num;
       }
   }
   
   public double raizCuadrada (double num)
   {
       return Math.sqrt(num);
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
        
        // El /* es para decir que quiero comentar y con el */ se cierra el comentario
        /*
        Numeros x;
        x = new Numeros ();
        
        //ejecutando metodos de clase a traves de una instancia
        x.reservaPrimeList(1000);
        x.reservaPerfectNaturalList(3000);
        x.LlenarprimesList();
        */
        
        Numeros operaciones = new Numeros (); //Defino la variable de instancia
        
        int num = 2;
        int pot = 3;
        double temporal; //definir y reservar espacio para un double
        temporal = operaciones.potencia(num, pot); //ejecutar metodo de una instancia y asignar el resultado
        System.out.println("El resultado de " + num + " a la " + pot + " es: " + temporal); //imprimir el resultado
        
        int numero = 9;
        double temp;
        temp = operaciones.raizCuadrada(numero);
        System.out.println("El resultado de la raiz cuadrada de " + numero + " es: " + temp);
        
        int num1 = 5;
        int num2 = 8;
        int tempo = operaciones.max(num1, num2);
        System.out.println("El numero mayor entre " + num1 + " y " + num2 + " es: " + tempo);
        
        int num3 = 5;
        int num4 = 8;
        int temporal2 = operaciones.min(num3, num4);
        System.out.println("El numero menor entre " + num3 + " y " + num4 + " es : " + temporal2);
        
        
        int num5 = -18; 
        int temporal3 = operaciones.valorAbsoluto(num5);
        System.out.println("El valor abosuluto de " + num5 + " es: " + temporal3);
         
    }
}
