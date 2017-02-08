/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Computadora
{
    private int capacidadDisco;
    private int capacidadRam;
    private float velProcesadorGhz; //velocidad del procesador Ghz

    //setter
    public void setCapacidadDisco(int capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }

    public void setCapacidadRam(int capacidadRam) {
        this.capacidadRam = capacidadRam;
    }

    public void setVelProcesadorGhz(float velProcesadorGhz) {
        this.velProcesadorGhz = velProcesadorGhz;
    }

    //getter
    public int getCapacidadDisco() {
        return capacidadDisco;
    }

    public int getCapacidadRam() {
        return capacidadRam;
    }

    public float getVelProcesadorGhz() {
        return velProcesadorGhz;
    }
     
    
    
}
