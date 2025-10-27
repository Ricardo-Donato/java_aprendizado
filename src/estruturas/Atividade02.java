package estruturas;

public class Atividade02 {
    public static void main(String[] args) {
        // a) Fila circular com capacidade 10
        FilaCircular filaCircular = new FilaCircular(10);

        // b) Inserir 7 elementos usando FilaObjeto + Pilha
        FilaObjeto aux = new FilaObjeto(10);
        aux.enqueue(10);
        aux.enqueue(20);
        aux.enqueue(30);
        aux.enqueue(40);
        aux.enqueue(50);
        aux.enqueue(60);
        aux.enqueue(70);

        PilhaObjeto pilha = new PilhaObjeto(10);
        while (!aux.isEmpty()) pilha.push(aux.dequeue());
        while (!pilha.isEmpty()) filaCircular.enqueue(pilha.pop());

        // c) Inversão com pilha
        PilhaObjeto pilhaInv = new PilhaObjeto(10);
        while (!filaCircular.isEmpty())
            pilhaInv.push(filaCircular.dequeue());
        while (!pilhaInv.isEmpty())
            filaCircular.enqueue(pilhaInv.pop());

        // d) Exibir
        System.out.println("Valores da fila circular após inversão:");
        while (!filaCircular.isEmpty()) {
            System.out.println(filaCircular.dequeue());
        }
    }
}