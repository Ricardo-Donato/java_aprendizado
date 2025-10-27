package estruturas;

public class FilaCircular {
    private No tras;
    private int tamanho;
    private int capacidade;

    public FilaCircular(int capacidade) {
        this.tras = null;
        this.tamanho = 0;
        this.capacidade = capacidade;
    }

    public void enqueue(Object elemento) {
        if (isFull()) {
            throw new RuntimeException("Fila circular cheia");
        }
        No novo = new No(elemento);
        if (isEmpty()) {
            tras = novo;
            tras.proximo = tras;
        } else {
            novo.proximo = tras.proximo;
            tras.proximo = novo;
            tras = novo;
        }
        tamanho++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila circular vazia");
        }
        No frente = tras.proximo;
        Object dado = frente.dado;
        if (tamanho == 1) {
            tras = null;
        } else {
            tras.proximo = frente.proximo;
        }
        tamanho--;
        return dado;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Fila circular vazia");
        }
        return tras.proximo.dado;
    }

    public boolean isEmpty() {
        return tras == null;
    }

    public boolean isFull() {
        return tamanho == capacidade;
    }

    public int size() {
        return tamanho;
    }
}