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
public class Aprendizaje 
{

    public String getTipo5() {
        return tipo5;
    }

    public void setTipo5(String tipo5) {
        this.tipo5 = tipo5;
    }

    public String getTipo6() {
        return tipo6;
    }

    public void setTipo6(String tipo6) {
        this.tipo6 = tipo6;
    }

    public int getPreciotipo5() {
        return preciotipo5;
    }

    public void setPreciotipo5(int preciotipo5) {
        this.preciotipo5 = preciotipo5;
    }

    public int getPreciotipo6() {
        return preciotipo6;
    }

    public void setPreciotipo6(int preciotipo6) {
        this.preciotipo6 = preciotipo6;
    }

    public int getCantJugadoresAprendizaje() {
        return cantJugadoresAprendizaje;
    }

    public void setCantJugadoresAprendizaje(int cantJugadoresAprendizaje) {
        this.cantJugadoresAprendizaje = cantJugadoresAprendizaje;
    }

    public int getDLCaprendizaje() {
        return DLCaprendizaje;
    }

    public void setDLCaprendizaje(int DLCaprendizaje) {
        this.DLCaprendizaje = DLCaprendizaje;
    }

    public String getModoJuegoAprendizaje() {
        return modoJuegoAprendizaje;
    }

    public void setModoJuegoAprendizaje(String modoJuegoAprendizaje) {
        this.modoJuegoAprendizaje = modoJuegoAprendizaje;
    }
    private String tipo5 = "Idioma";
    private String tipo6 = "Musica";
    
    private int preciotipo5;
    private int preciotipo6;
    private int cantJugadoresAprendizaje;
    private int DLCaprendizaje;
    private String modoJuegoAprendizaje;
    
    public void printAprendizaje()
    {
        System.out.println("Tipo de videojuego: " + tipo5 + ". El precio es: " + preciotipo5);
        System.out.println("Tipo de videojuego: " + tipo6 + ". El precio es: " + preciotipo6);
        System.out.println("Para " + cantJugadoresAprendizaje + " o más jugadores");
        System.out.println("DLC disponibles: " + DLCaprendizaje);
        System.out.println("Modo de jugabilidad elegido: " + modoJuegoAprendizaje);
        System.out.println("");
    }
}
