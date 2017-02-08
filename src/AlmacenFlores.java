/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
//cuantashay inicializar almacen
public class AlmacenFlores 
{
    private Flores[] almacen;
    private FabricaFlores fabrica;
    int NFloresGuardadas;
    
    public Flores[] getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Flores[] almacen) {
        this.almacen = almacen;
    }
    
    public void surtir(int n, int precio, String tipo, String olor)
    {
        for (int i = 0; i < 10; i++) 
        {
            almacen[NFloresGuardadas] = fabrica.crearFlor(tipo, precio, olor);
            NFloresGuardadas++;
        }
    }
    
    public void inicializarAlmacen()
    {
        almacen = new Flores[200];
        fabrica = new FabricaFlores();
        NFloresGuardadas = 0;
    }
    
    public int CuantasFloresHay()
    {
        System.out.println("Se almacenaron: " + NFloresGuardadas);
        return NFloresGuardadas;
    }
    
    public static void main(String[] args) 
    {
        AlmacenFlores a = new AlmacenFlores();
        
        a.inicializarAlmacen();
        a.surtir(4, 12, "Girasol", "Miel");
        a.surtir(2, 20, "Rosa", "Chocolate");
        a.CuantasFloresHay();
        
        for (int i = 0; i < a.CuantasFloresHay(); i++) 
        {
            a.getAlmacen()[i].printFlor();
        }
    }
}
