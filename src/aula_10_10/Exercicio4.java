package aula_10_10;

/**
 *
 * @author Pedro
 */
public class Exercicio4 {

    public static void main(String[] args) {
        int x = 5;
        int y = ++x + x++ + --x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        // Retorna x = 6 e y = 18
    }
}