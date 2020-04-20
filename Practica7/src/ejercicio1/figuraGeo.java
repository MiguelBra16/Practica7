/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author bragh
 */
public class figuraGeo implements Area, Perimetro{
    public double area;
    public double perimetro;
    
    @Override
    public double calA(double base, double altura){
        return base * altura;
    }
    
    @Override
    public double calP(double largo, double ancho){
        return 2 * (largo + ancho); 
    }
}
