package aula_10_10;
import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class OperacoesDeComparacao { // Operações de comparação

    public static void main(String[] args) {
        // Exercício 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = scanner.nextInt();
        
        System.out.println("\nOperações de cálculo:");
        System.out.println("Soma: " + (n1 + n2));
        System.out.println("Primeiro menos segundo: " + (n1 - n2));
        System.out.println("Produto: " + n1 * n2);
        System.out.println("Primeiro dividido pelo segundo: " + n1 / n2);
        System.out.println("Resto da divisão: " + n1 % n2);
        
        // Exercício 2
        System.out.println("\nOperações de comparação:");
        System.out.println("Primeiro maior que o segundo? " + (n1 > n2));
        System.out.println("Segundo menor ou igual ao primeiro? " + (n2 <= n1));
        System.out.println("Os dois são iguais? " + (n2 == n1));
        System.out.println("Os dois são diferentes? " + (n2 != n1));
    }
}