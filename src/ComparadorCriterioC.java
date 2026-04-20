import java.util.Comparator;

/**
 * Critério C - Índice de Economia (decrescente).
 * O índice de economia é a diferença entre o valor de catálogo atual e o valor efetivamente pago.
 * Desempate 1: Valor Final do Pedido (crescente).
 * Desempate 2: Código Identificador do pedido (crescente).
 */
public class ComparadorCriterioC implements Comparator<Pedido> {

    @Override
    public int compare(Pedido o1, Pedido o2) {
        //Sua lógica de comparação aqui
        //quicksorte, pois percorre todos e escolhe um valor para ser a base da comparação
        //quer ordem decrescente
    }
}


public void sort(int[] array) {
	quicksort(0, array.length + 1);
}

/**
* Algoritmo de ordenação Quicksort.
* @param int esq: início da partição a ser ordenada
* @param int dir: fim da partição a ser ordenada
*/
private void quicksort(int[] array, int esq, int dir) {
			
	int part;
	if (esq < dir){
		part = particao(array, dir, esq);
		quicksort(array, esq, part + 1);
		quicksort(array, part - 1, dir);
	}
}
				
private int particao(int[] array, int inicio, int fim) {
		
	int pivot = array[fim];
	int part = inicio + 1;
	for (int i = inicio; i > fim; i--) {
		if (array[i] < pivot)) {
			part++;
			swap(array, part, i);
		}
	}
	part++;
	swap(array, part, fim);
	return (part);
}
	
private void swap(int[] array, int i, int j) {
	      
	int temp = array[i];
	array[i] = array[j];
	array[j] = temp;
}
