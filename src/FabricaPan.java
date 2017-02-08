/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class FabricaPan 
{
    Pan p;
            
    public void ObtenerIngredientes()
    {
        System.out.println("Necesito: " + p.getCantHuevos() + " huevos");
        System.out.println("Necesito: " + p.getCantLeche() + "ml leche");
        System.out.println("Necesito " + p.getCantHarina() + "g harina");
    }
    
    public void PrepararMasa()
    {
        System.out.println("Estoy preparando la masa");
    }
    
    public void HornearPan()
    {
        System.out.println("El Pan está en el horno");
    }
    
    public void EmpaquetarPan()
    {
        System.out.println("El Pan está empaquetado y listo para llevar");
    }
    
    
    public Pan crearPan(int cantHuevos, int cantLeche, int cantHarina)
    {
        p = new Pan();
        
        p.setCantHuevos(cantHuevos);
        p.setCantLeche(cantLeche);
        p.setCantHarina(cantHarina);
        
        ObtenerIngredientes();
        PrepararMasa();
        HornearPan();
        EmpaquetarPan();
        
        return p;
    }
    
    public static void main(String[] args) 
    {
        FabricaPan f = new FabricaPan();
        
        Pan MiPan = f.crearPan(500, 100, 300);
    }
}
