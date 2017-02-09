/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioVideoJuegos;

/**
 *
 * @author Pablo
 */
/*Además de la definición de los productos se pide que elabores un almacén (una clase que encapsule los procesos de un almacén de videojuegos). 
Las operaciones disponibles para el almacén son:
Inicializar el inventario con 100 espacios
Agregar videojuegos al inventario
Eliminar videojuegos del inventario (elimina por número de serie o por nombre). 
*/
public class AlmacenVideojuegos 
{   
    private Estrategia [] juegosEstrategia;
    private Aventura [] juegosAventura;
    private Aprendizaje [] juegosAprendizaje;
    
    private FabricaVideojuegos fabrica;
    private int nJuegosGuardadosEstrategia;
    private int nJuegosGuardadosAventura;
    private int nJuegosGuardadosAprendizaje;
    
    public int expulsar;
    public String juegoeliminar;

    public Estrategia[] getJuegosEstrategia() {
        return juegosEstrategia;
    }

    public void setJuegosEstrategia(Estrategia[] juegosEstrategia) {
        this.juegosEstrategia = juegosEstrategia;
    }

    public Aventura[] getJuegosAventura() {
        return juegosAventura;
    }

    public void setJuegosAventura(Aventura[] juegosAventura) {
        this.juegosAventura = juegosAventura;
    }

    public Aprendizaje[] getJuegosAprendizaje() {
        return juegosAprendizaje;
    }

    public void setJuegosAprendizaje(Aprendizaje[] juegosAprendizaje) {
        this.juegosAprendizaje = juegosAprendizaje;
    }
    
    public void inicializarAlmacen()
    {
        juegosEstrategia = new Estrategia[100];
        juegosAventura = new Aventura[100];
        juegosAprendizaje = new Aprendizaje[100];
        
        fabrica = new FabricaVideojuegos();
        
        nJuegosGuardadosEstrategia = 0;
        nJuegosGuardadosAventura = 0;
        nJuegosGuardadosAprendizaje = 0;
    }
    
    public void agregarVideojuegosEstrategia(int n, String tipo, String tipo1, int precio, int precio1, int DLC, int cantJugadores, String modoJuego)
    {
        for (int i = 0; i < n; i++) 
        {
            juegosEstrategia[nJuegosGuardadosEstrategia] = fabrica.crearEstrategia(tipo, tipo1, precio, precio1, cantJugadores, DLC, modoJuego);
            nJuegosGuardadosEstrategia++; 
        }
    }
      public void agregarVideojuegosAventura(int n, String tipo, String tipo1, int precio, int precio1, int DLC, int cantJugadores, String modoJuego)
    {
        for (int i = 0; i < n; i++) 
        {
            juegosAventura[nJuegosGuardadosAventura] = fabrica.crearAventura(tipo, tipo1, precio, precio1, cantJugadores, DLC, modoJuego);
            nJuegosGuardadosAventura++;
        }
    }
      public void agregarVideojuegosAprendizaje(int n, String tipo, String tipo1, int precio, int precio1, int DLC, int cantJugadores, String modoJuego)
    {
        for (int i = 0; i < n; i++) 
        {
            juegosAprendizaje[nJuegosGuardadosAprendizaje] = fabrica.crearAprendizaje(tipo, tipo1, precio, precio1, cantJugadores, DLC, modoJuego);
            nJuegosGuardadosAprendizaje++;
        }
    }
    
    public int cuantosJuegosHayAP()
    {
        System.out.println("Se guardaron: " + nJuegosGuardadosAprendizaje + " Juegos de Aprendizaje");
        System.out.println("");
        
        return nJuegosGuardadosAprendizaje;
    }
    
    public int cuantosJuegosHayE()
    {
        System.out.println("Se guardaron: " + nJuegosGuardadosEstrategia + " Juegos de Estrategia");
        System.out.println("");
        
        return nJuegosGuardadosEstrategia;
    }
    
    public int cuantosJuegosHayAV()
    {
        System.out.println("Se guardaron: " + nJuegosGuardadosAventura + " Juegos de Aventura");
        System.out.println("");
        
        return nJuegosGuardadosAventura;
    }
    
    public void eliminar(int expulsar, String juegoeliminar)
    {
        Estrategia e = new Estrategia();
        
        if(juegoeliminar == e.getTipo1()) 
        {
            nJuegosGuardadosEstrategia = nJuegosGuardadosEstrategia - expulsar;
            System.out.println("SE ELIMINO: " + expulsar + " videojuegos de " + juegoeliminar);
        }
        else
        {
            System.out.println("No se elmino nada");
            System.out.println("");
        }
    }
    
    public static void main(String[] args) 
    {
        AlmacenVideojuegos imprimir = new AlmacenVideojuegos();
        
        imprimir.inicializarAlmacen();
        imprimir.agregarVideojuegosEstrategia(6, "Lucha", "error", 600, 0, 10, 8, "Solitario");
        imprimir.agregarVideojuegosAventura(3, "Plataforma", "error", 100, 0, 2, 4, "Survival");
        imprimir.agregarVideojuegosAprendizaje(2, "Musica", "error", 500, 0, 5, 5,"Multiplayer");
        imprimir.eliminar(3, "Lucha"); 
       
        
        for (int i = 0; i < imprimir.cuantosJuegosHayE(); i++) 
        {
           imprimir.getJuegosEstrategia()[i].printEstrategia();
        }
        
        for (int i = 0; i < imprimir.cuantosJuegosHayAP(); i++)
        {
         imprimir.getJuegosAprendizaje()[i].printAprendizaje();
        }
        
        for (int i = 0; i < imprimir.cuantosJuegosHayAV(); i++)
        {
         imprimir.getJuegosAventura()[i].printAventura();
        }
        
      
              
    }
}
