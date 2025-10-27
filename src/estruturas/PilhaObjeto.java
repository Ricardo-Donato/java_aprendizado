package estruturas;

public class PilhaObjeto {
    private No topo;
    private int tamanho;
    private int capacidade;

    public PilhaObjeto(int capacidade) {
        this.topo = null;
        this.tamanho = 0;
        this.capacidade = capacidade;
    }

    public void push(Object elemento) {
        if (isFull()) {
            throw new RuntimeException("Pilha cheia");
        }
        No novo = new No(elemento);
        novo.proximo = topo;
        topo = novo;
        tamanho++;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        Object dado = topo.dado;
        topo = topo.proximo;
        tamanho--;
        return dado;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return topo.dado;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public boolean isFull() {
        return tamanho == capacidade;
    }

    public int size() {
        return tamanho;
    }
}