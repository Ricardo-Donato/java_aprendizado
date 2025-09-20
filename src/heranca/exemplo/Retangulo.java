/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.exemplo;

/**
 *
 * @author Pedro
 */
public class Retangulo extends Forma{
    private double largura;
    private double altura;
    
    public double getLargura() {
        return this.largura;
    }
    
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return this.largura*this.altura;
    }
}
