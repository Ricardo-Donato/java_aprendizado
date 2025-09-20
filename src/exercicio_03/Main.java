/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_03;

/**
 *
 * @author Pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        System.out.println("Saldo inicial: " + conta.getSaldo());
        conta.depositar(350.12);
        System.out.println("Saldo depois do depósito: " + conta.getSaldo());
        conta.sacar(200.5);
        System.out.println("Saldo depois de sacar: " + conta.getSaldo());
    }
    
}
