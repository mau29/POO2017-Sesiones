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
/*La creación de videojuegos involucra las siguientes operaciones:
Concepción
Diseño
Planificación
Producción
Pruebas de aceptación
*/

public class FabricaVideojuegos 
{
    private Estrategia e;
    private Aventura av;
    private Aprendizaje ap;
            
    private void concepcion()
    {
        System.out.println("Creando la idea del Juego...");
    }
    
    private void Diseño()
    {
        System.out.println("Diseñando...");
    }
    
    private void Planificacion()
    {
        System.out.println("Planificacion del videojuego...");
    }
    
    private void Produccion()
    {
        System.out.println("Produciendo videojuego...");
    }
    
    private void PruebaAceptacion()
    {
        System.out.println("¡Juego aprobado!");
        System.out.println("");
    }
    
    public Estrategia crearEstrategia(String tipo1, String tipo2, int precio1, int precio2, int cantJugadores, int DLC, String modo)
    {
        e = new Estrategia();
        
        e.setTipo1(tipo1);
        e.setTipo2(tipo2);
        
        e.setPreciotipo1(precio1);
        e.setPreciotipo2(precio2);
        e.setCantJugadores(cantJugadores);
        e.setDLC(DLC);
        e.setModoJuego(modo);
        
        concepcion();
        Diseño();
        Planificacion();
        Produccion();
        PruebaAceptacion();
      
        return e;
    }
    
    public Aventura crearAventura(String tipo3, String tipo4, int precio3, int precio4, int cantJugadores, int DLC, String modo)
    {
        av = new Aventura();
        
        av.setTipo3(tipo3);
        av.setTipo4(tipo4);
        
        av.setPreciotipo3(precio3);
        av.setPreciotipo4(precio4);
        av.setCantJugadoresAventura(cantJugadores);
        av.setDLCaventura(DLC);
        av.setModoJuegoAventura(modo);
        
        concepcion();
        Diseño();
        Planificacion();
        Produccion();
        PruebaAceptacion();
        
        return av;
    }
    
    public Aprendizaje crearAprendizaje(String tipo5, String tipo6, int precio5, int precio6, int cantJugadores, int DLC, String modo)
    {
        ap = new Aprendizaje();
        
        ap.setTipo5(tipo5);
        ap.setTipo6(tipo6);
        
        ap.setPreciotipo5(precio5);
        ap.setPreciotipo6(precio6);
        ap.setCantJugadoresAprendizaje(cantJugadores);
        ap.setDLCaprendizaje(precio6);
        ap.setModoJuegoAprendizaje(modo);
        
        concepcion();
        Diseño();
        Planificacion();
        Produccion();
        PruebaAceptacion();
        
        return ap;
    }
    
    public static void main(String[] args) 
    {
        FabricaVideojuegos f = new FabricaVideojuegos();
        
        f.crearEstrategia("Lucha", "error", 500, 0, 4, 1, "Sobrevivencia").printEstrategia();
        f.crearAventura("Plataforma", "error", 1000, 0, 2, 5, "Un jugador").printAventura();
        f.crearAprendizaje("Idioma", "error", 200, 0, 1, 0, "Chino").printAprendizaje();
    }
}
