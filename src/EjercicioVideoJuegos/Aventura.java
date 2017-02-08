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
public class Aventura
{

    public String getTipo3() {
        return tipo3;
    }

    public void setTipo3(String tipo3) {
        this.tipo3 = tipo3;
    }

    public String getTipo4() {
        return tipo4;
    }

    public void setTipo4(String tipo4) {
        this.tipo4 = tipo4;
    }

    public int getPreciotipo3() {
        return preciotipo3;
    }

    public void setPreciotipo3(int preciotipo3) {
        this.preciotipo3 = preciotipo3;
    }

    public int getPreciotipo4() {
        return preciotipo4;
    }

    public void setPreciotipo4(int preciotipo4) {
        this.preciotipo4 = preciotipo4;
    }

    public int getCantJugadoresAventura() {
        return cantJugadoresAventura;
    }

    public void setCantJugadoresAventura(int cantJugadoresAventura) {
        this.cantJugadoresAventura = cantJugadoresAventura;
    }

    public int getDLCaventura() {
        return DLCaventura;
    }

    public void setDLCaventura(int DLCaventura) {
        this.DLCaventura = DLCaventura;
    }

    public String getModoJuegoAventura() {
        return modoJuegoAventura;
    }

    public void setModoJuegoAventura(String modoJuegoAventura) {
        this.modoJuegoAventura = modoJuegoAventura;
    }
    private String tipo3 = "Plataforma";
    private String tipo4 = "Grafica";
    
    private int preciotipo3;
    private int preciotipo4;
    private int cantJugadoresAventura;
    private int DLCaventura;
    private String modoJuegoAventura;
    
    public void printAventura()
    {
        System.out.println("Tipo de vieojuego 1: " + tipo3 + " , precio: " + preciotipo3);
        System.out.println("Tipo de videojuego 2: " + tipo4 + " , preico: " + preciotipo4);
        System.out.println("Para " + cantJugadoresAventura + " o más jugadores");
        System.out.println("DLC disponibles " + DLCaventura);
        System.out.println("Modo de jugabilidad elegido: " + modoJuegoAventura);
        
    }
}
