/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Pan 
{
    
    private int cantHarina;
    private int cantHuevos;
    private int cantLeche;

    //setter
    public void setCantHarina(int cantHarina) {
        this.cantHarina = cantHarina;
    }

    public void setCantHuevos(int cantHuevos) {
        this.cantHuevos = cantHuevos;
    }

    public void setCantLeche(int cantLeche) {
        this.cantLeche = cantLeche;
    }

    //getter
    public int getCantHarina() {
        return cantHarina;
    }

    public int getCantHuevos() {
        return cantHuevos;
    }

    public int getCantLeche() {
        return cantLeche;
    }
    
}
