/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class FabricaFlores 
{
    private Flores F;
    
    private void LasFlores()
    {
        System.out.println("Flor de: " + F.getTipoFlor());
        System.out.println("Que huele a: " + F.getOlor());
        System.out.println("Precio: " + F.getPrecio());
        System.out.println("");
    }
    
    public Flores crearFlor(String tipo, int precio, String olor)
    {
        F = new Flores();
        
        F.setOlor(olor);
        F.setPrecio(precio);
        F.setTipoFlor(tipo);
        
        LasFlores();
        
        return F;
        
    }
    
    public static void main(String[] args) 
    {
        FabricaFlores fabrica = new FabricaFlores();
        
        fabrica.crearFlor("Girasol", 20, "miel");
    }
}
