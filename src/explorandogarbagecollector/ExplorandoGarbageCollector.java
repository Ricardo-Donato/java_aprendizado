/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package explorandogarbagecollector;

/**
 *
 * @author Pedro
 */
public class ExplorandoGarbageCollector {
    
    public static void main(String[] args) {
        // Cria um objeto grande para consumir memória (um array de 1 milhão de inteiros)
        int[] largeArray = new int[10000000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i; // Preenche o array para simular uso
        }
        
        // Imprime a memória usada antes de tornar o objeto elegível para GC
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória usada antes: " + (runtime.totalMemory() - runtime.freeMemory()) / 1024 + " KB");
        
        // Torna o objeto elegível para GC ao remover a referência
        largeArray = null;
        
        // Sugere ao GC que execute a coleta (não é garantido, mas útil para testes)
        System.gc();
        
        // Espera um pouco para dar tempo ao GC (em threads de background)
        try {
            Thread.sleep(1000); // Pausa de 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Imprime a memória usada após sugestão de GC
        System.out.println("Memória usada após: " + (runtime.totalMemory() - runtime.freeMemory()) / 1024 + " KB");
    }
}
