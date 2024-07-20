/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author Usuario
 */
public class Formas {
    private String color;
    private String Dibujar;
    private String Radio;
    public String Area;
    public String Largo;
    
    public  Formas(){
        
    }   
    public void establecerDibujar(String Dibujar){
    this.Dibujar = Dibujar;   
}
 public String ObtenerDibujar(){
    return this.Dibujar = Dibujar;
}   
 
     public void establecerColor(String color){
    this.color = color;   
}
 public String ObtenerColor(){
    return this.color = color;
}
     
    public void imprimirInformacion(){
     System.out.println("color: " + color);   
     System.out.println("Dibujar: " + Dibujar);  
     System.out.println("Radio: " + Radio);
     System.out.println("Area: " + Area);
     System.out.println("Largo: " + Largo);
    }
       public void establecerRadio(String Radio){
    this.Radio = Radio;   
}
     public void CalcularArea(String Area){
    this.Area = Area;   
}
     public void establecerLargo(String Largo){
    this.Largo = Largo;   
}
     
}   
 
