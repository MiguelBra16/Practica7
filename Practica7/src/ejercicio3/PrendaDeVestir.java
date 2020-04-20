/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author bragh
 */
public abstract class PrendaDeVestir {
    public String talla;
    public String color;
    
    public PrendaDeVestir(String talla, String color){
        this.talla = talla;
        this.color = color;
    }
    public abstract String vestir();
}
