package estruturas;

public class FilaObjeto {
    private No frente;
    private No tras;
    private int tamanho;
    private int capacidade;

    public FilaObjeto(int capacidade) {
        this.frente = null;
        this.tras = null;
        this.tamanho = 0;
        this.capacidade = capacidade;
    }

    public void enqueue(Object elemento) {
        if (isFull()) {
            throw new RuntimeException("Fila cheia");
        }
        No novo = new No(elemento);
        if (isEmpty()) {
            frente = novo;
            tras = novo;
        } else {
            tras.proximo = novo;
            tras = novo;
        }
        tamanho++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        Object dado = frente.dado;
        frente = frente.proximo;
        if (frente == null) {
            tras = null;
        }
        tamanho--;
        return dado;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        return frente.dado;
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public boolean isFull() {
        return tamanho == capacidade;
    }

    public int size() {
        return tamanho;
    }
}