import java.util.Comparator;

/**
 * Critério A - Valor Final do Pedido (crescente).
 * Desempate 1: Volume Total de Itens (quantProdutos).
 * Desempate 2: Código Identificador do primeiro item do pedido.
 */
public class ComparadorCriterioA implements Comparator<Pedido> {

    @Override
    public int compare(Pedido o1, Pedido o2) {

        //Sua lógica de comparação aqui
        //nesse caso, melhor utilizar heapsort, pois compara e troca a posição. logo não há necessidade de percorrer todo o vetor
    
        public Heapsort(Comparator<T> comparador) {
		
		comparacoes = 0;
		volume total de itens = 0;
		setComparador(comparador);
	}
    }
}
@Override
	public void setComparador(Comparator<T> comparador) {
		this.comparador = comparador;
	}
	
	@Override
	public T[] ordenar (T[] dados) {

		dadosOrdenados = dados;
		
		comparacoes = 0;
		volume total de itens = 0;
        //é um metodo lento, entao caso o sitema precise ser rápido, não será benefico. 
