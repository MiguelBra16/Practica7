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
public class camisa extends PrendaDeVestir implements tela, EstiloDeCamisa{
    public camisa(String talla,String color){
        super(talla, color);
    }
    
    @Override
    public String vestir(){
        return "Probar camisa";
    }
    
    @Override
    public String tipoTela(){
        return "La tela de esta camisa es ceda";
    }
    
    @Override
    public String estilo(){
        return "El estilo de la camisa es polo";
    }
}
