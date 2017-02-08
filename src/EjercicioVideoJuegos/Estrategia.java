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
public class Estrategia 
{

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public int getPreciotipo1() {
        return preciotipo1;
    }

    public void setPreciotipo1(int preciotipo1) {
        this.preciotipo1 = preciotipo1;
    }

    public int getPreciotipo2() {
        return preciotipo2;
    }

    public void setPreciotipo2(int preciotipo2) {
        this.preciotipo2 = preciotipo2;
    }

    public int getCantJugadores() {
        return cantJugadoresEstrategia;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadoresEstrategia = cantJugadores;
    }

    public int getDLC() {
        return DLCestrategia;
    }

    public void setDLC(int DLC) {
        this.DLCestrategia = DLC;
    }

    public String getModoJuego() {
        return modoJuegoEstrategia;
    }

    public void setModoJuego(String modoJuego) {
        this.modoJuegoEstrategia = modoJuego;
    }
    private String tipo1 = "Lucha";
    private String tipo2 = "Arcade";
    
    private int preciotipo1;
    private int preciotipo2;
    private int cantJugadoresEstrategia;
    private int DLCestrategia;
    private String modoJuegoEstrategia;
    
    public void printEstrategia()
    {
        System.out.println("Tipo de vieojuego 1: " + tipo1 + " , precio: " + preciotipo1);
        System.out.println("Tipo de videojuego 2: " + tipo2 + " , preico: " + preciotipo2);
        System.out.println("Para " + cantJugadoresEstrategia + " o más jugadores");
        System.out.println("DLC disponibles " + DLCestrategia);
        System.out.println("Modo de jugabilidad elegido: " + modoJuegoEstrategia);
        
    }
}
