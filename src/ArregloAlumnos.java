/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */

//Para cambiar el nombre, Ctrl + r y click en refactor 
public class ArregloAlumnos 
{
    //Aqui se define los atributos (fields, class variables) fields=campos 
 private String [] alumnos;
 private int contador;
 
 //metodos
 public void inicializaArreglo(int size) //size = tamaño
 {
     alumnos = new String [size];
     contador = 0;
 }
 
 public void agregarNombre (String nombre)
 {
     alumnos[contador] = nombre;
     contador = contador + 1; //contador++;
 }
 
 public void imprimirArreglo()
 {
     for (int i = 0; i < contador; i++) 
     {
         System.out.println("Nombre " + (i+1) + alumnos[i]);
     }
 }
 
 //psvm
    public static void main(String[] args)  
    {
        //pdeclaro variable de tipo clase Arreglos
        ArregloAlumnos alumnosUdla;
        //reservo espacio para la instancia
        alumnosUdla = new ArregloAlumnos();
        
        alumnosUdla.inicializaArreglo(10);
        alumnosUdla.agregarNombre("Pedrito");
        alumnosUdla.agregarNombre("Rodrigo");
        alumnosUdla.agregarNombre("Roberto");
        alumnosUdla.imprimirArreglo();
    }
}
