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
public class FabricaDonas 
{
    private Dona d;
    private void amasar()
    {
        System.out.println("Amasando una Dona de " + d.getTipoDona());
    }
    
    private void mezclarIngredientes()
    {
        System.out.println("Mezclando ingredientes de sabor " + d.getSabor());
    }
    
    private void hornear()
    {
        System.out.println("Horneando la dona");
        System.out.println("");
    }
    
    public Dona [] empaquetar(int n, int tipo, String sabor, int precio) //numero de donas a empaquetar = n
    {
        Dona[] paquete; //creando un paquete
        paquete = new Dona [n]; //dando la cantidad al paquete de n
        
        for (int i = 0; i < n; i++) //i<n porque n es el numero de donas que yo le diga 
        {
            paquete[i] = crearDona(tipo, sabor, precio); //i para que imprima mas de una dona, es decir, dona 0, dona 1, etc.
        }
        System.out.println("El costo total es: " + n*precio);
        
        return paquete; //tiene que devolver el arreglo porque estas diciendo que llamas un arreglo
    }
    
    
    public Dona crearDona(int tipo, String sabor, float precio)
    {
        d = new Dona();
        
        d.setTipoDona(tipo);
        d.setSabor(sabor);
        d.setPrecio(precio);
        
        amasar();
        mezclarIngredientes();
        hornear();
        
        return d;
    }
    
    public static void main(String[] args)
    {
        FabricaDonas f = new FabricaDonas();
        
        f.empaquetar(6, 1, "fresa", 12);
    }
}
