/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author bragh
 */
public class producto implements impuesto, caducidad{
    public double costo;
    public String fechaCadu;
    public double impuestoIVA;
    public double total;
    
    @Override
    public double calImp(double costo){
        return costo*0.13;
    }
    
    @Override
    public double calTotal(double costo){
        return this.costo + this.impuestoIVA;
    }
    
    @Override
    public String fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMM/YYYY");
        return formatoFecha.format(fecha);
    }
}
