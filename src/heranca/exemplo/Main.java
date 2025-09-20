/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca.exemplo;

/**
 *
 * @author Pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Forma f1;
        
        Retangulo r1 = new Retangulo();
        r1.setAltura(5);
        r1.setLargura(5);
        f1 = r1;
        double areaRetangulo = f1.calcularArea();
        System.out.println("Area do retângulo: " + String.format("%.2f", areaRetangulo));
        
        Circulo c1 = new Circulo();
        c1.setRaio(4);
        f1 = c1;
        
        double areaCirculo = f1.calcularArea();
        System.out.println("Area do círculo: " + String.format("%.2f",areaCirculo));
    }
    
}
