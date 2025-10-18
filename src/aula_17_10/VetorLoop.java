package aula_17_10;

/**
 *
 * @author Pedro
 */
public class VetorLoop {

    public static void main(String[] args) {
        // Preencha um vetor int com loop, sendo
        // que a cada iteração cada número a ser
        // preenchido é de 10 em 10

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = (i + 1) * 10;
        }

        /*
         * uso de for normal
         * for (int i = 0; i < numeros.length; i++){
         * System.out.println(numeros[i]);
         * }
         */

        /*
         * uso de foreach
         * tipo, variável para percorrer e vetor
         * for(int num : numeros){
         * System.out.println(num);
         * }
         */

        // Inverter a ordem dos elementos do numerosor
        int inicio = 0;
        int fim = numeros.length - 1; // diminui-se devido ao vetor começar em 0
        while (inicio < fim) {
            int temp = numeros[inicio]; // guarda em uma variável temporária o valor do vetor na posição inicial
            numeros[inicio] = numeros[fim]; // armazena no inicio do vetor o último elemento dele
            numeros[fim] = temp; // usa o temp para guardar o primeiro valor no final
            inicio++;
            fim--;
            // atualiza as variáveis para evitar loop infito
            // vetor = [1, 2, 3];
            // reversevetor = [3, 2, 1];
            // temp = vetor[inicio] equivalente a temp = 1
            // vetor[0] = vetor[fim], onde o 3 sobrescreve 1
            // vetor[fim] = temp, onde temp é usada para guardar no ínidice final
            // inicio++ e fim-- para atualizar os índices;
        }
        for (int num : numeros) {
            System.out.println(num);
        }

        // Somar todos os elementos desse vetor
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("Soma de todos os elementos do vetor: " + soma);

        // Ordenar o vetor em ordem crescente
        /*
         * utilizar um loop para pegar um único valor
         * e depois loopar todo o vetor para comparar valor por valor
         * para aí sim encontrar o menor possível
         * sendo que j vai ser maior que i, ou seja, j = i + 1
         * para evitar comparações desnecessárias
         */
    }
}