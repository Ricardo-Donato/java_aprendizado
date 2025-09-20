/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.exemplo;

/**
 *
 * @author Pedro
 */
public class Circulo extends Forma{
    private double raio;
    
    public double getRaio() {
        return this.raio;
    }
    
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(this.raio, 2);
    }
}
