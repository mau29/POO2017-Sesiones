/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class FabricaCompus
{
    Computadora c;
    
    public void ensamblarHardware()
    {
        System.out.println("Estoy instalando el Hardware: ");
        System.out.println("RAM: " + c.getCapacidadRam());
        System.out.println("Disco Duro: " + c.getCapacidadDisco());
        System.out.println("Procesador: " + c.getVelProcesadorGhz());
    }
    
    public void instalarSoftware()
    {
        System.out.println("Estoy instalando el sistema operativo Windows");
    }
    
    public void configurar()
    {
        System.out.println("Configurando Windows");
    }
    
    public void embalar()
    {
        System.out.println("Empaquetando computadora");
    }
    
    //metodo
    public Computadora crearComputadora (int capDisco, int capRam, float velProc)
    {
        c = new Computadora ();
        
        c.setCapacidadDisco(capDisco);
        c.setCapacidadRam(capRam);
        c.setVelProcesadorGhz(velProc);
        
        ensamblarHardware();
        instalarSoftware();
        configurar();
        embalar();
        
        System.out.println("La computadora está lista para ser entregada");
        
        return c;
    }
    
    public static void main(String[] args) 
    {
        FabricaCompus f = new FabricaCompus();
        
        Computadora miCompu = f.crearComputadora(1000, 16, 2.9f);
    }
}
