/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_03;

/**
 *
 * @author Pedro
 */
public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;
    
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo() {
       return this.saldo;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    
}
