/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author Pablo
 */
public class Arrays 
{ 
    private int [] container = {1,2,3,4,5,6,7,8}; //ponerle valores a una arreglo
    
    int find(int value, int i) //value=valor que busco, //i=posicion del valor
    {
        if(container[i] == value) // si container en la posicion i es igaul al valor que estoy buscnado
        {
            return i;
        }
        
        if(i == container.length-1) // si i es igual al ultimo elemento
        {
            return -1;
        }
        return find(value, ++i); 
        //pre Incremento ++i
        //post Incremento i++
        /*
        int i=0;
        i=i+1
        print(i++) sale 1
        print(++i) sale 3
        */
    }
    
    int binarysSearch(int i, int f, int val) //inicio, fin, valor
    {
        if(container[i] == val)
        {
            return i;
        }
        
        if(i == f)
        {
            return -1;
        }
        
        int temp = f/2; //dividir el contenedor a la mitad, no importa si es par o impar //en el caso de impar no redondea
        
        if(container[temp] > val )
        {
            return binarysSearch(i, temp, val); //lado izquierda
        }
        else
        {
            int temp1 = f;
            return binarysSearch(temp1, f, val); //lado derecho
        }
    }
    
    public static void main(String[] args) 
    {
        Arrays a = new Arrays ();
        int pos = a.binarysSearch(0, 6, 7);
        System.out.println("Numero 7 está en la posicion: " + pos );
    }
}
