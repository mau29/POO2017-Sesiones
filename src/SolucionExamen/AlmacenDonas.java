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
public class AlmacenDonas
{
    private Dona [] almacen; // arreglo de donas que se llama Almacen
    private FabricaDonas fabrica;
    private int numeroDonasGuardadas;
    
    public Dona[] getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Dona[] almacen) {
        this.almacen = almacen;
    }
    
    public void surtir(int n, int tipo, String sabor, float precio)
    {
        for (int i = 0; i < n; i++) 
        {
            almacen[numeroDonasGuardadas] = fabrica.crearDona(tipo, sabor, precio);
            numeroDonasGuardadas++;
        }
    }
    
    public void inicializaAlmacen()
    {
        almacen = new Dona[5000];
        fabrica = new FabricaDonas();
        numeroDonasGuardadas = 0;
    }
    
    public int cuantasDonasHay()
    {
        System.out.println("Se almacenaron: " + numeroDonasGuardadas + " Donas");
        return numeroDonasGuardadas;
    }
    
    public static void main(String[] args) 
    {
        AlmacenDonas store = new AlmacenDonas();
        
        store.inicializaAlmacen();
        store.surtir(10, 1, "cajeta", 20);
        store.surtir(15, 2, "chocolate", 14);
        store.surtir(5, 3, "fresa", 12);
        store.cuantasDonasHay();
        
        for (int i = 0; i < store.cuantasDonasHay(); i++) //devuelve el numero de donas que hay 
        {
            store.getAlmacen()[i].printDona(); //get almacen devuelve el arreglo, los corchetes para acceder a la posicion que quiero es i
        }
    }
}
