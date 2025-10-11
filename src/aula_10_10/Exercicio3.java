package aula_10_10;
import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua  idade:");
        int idade = scanner.nextInt()   ;
        String maioridade = idade >= 18 ? "Você é maior de idade." : "Você não é maior de idade.";
        String podeDirigir = idade >= 18 ? "Pode dirigir, contanto que tenha CNH" : "Não pode dirigir.";
        String negarIdosa = idade < 60 ? "Não é idosa." : "É idosa.";
        
        System.out.println("Com isso, posso determinar que:");
        System.out.println(maioridade);
        System.out.println(podeDirigir);
        System.out.println(negarIdosa);
    }
}