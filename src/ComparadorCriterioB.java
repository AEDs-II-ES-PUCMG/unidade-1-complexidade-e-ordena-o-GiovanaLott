import java.util.Comparator;

/**
 * Critério B - Volume Total de Itens (crescente).
 * Desempate 1: Data do Pedido.
 * Desempate 2: Código Identificador do pedido.
 */
public class ComparadorCriterioB implements Comparator<Pedido> {

    @Override
    public int compare(Pedido o1, Pedido o2) {
        //Sua lógica de comparação aqui
    }
}
//critério total de produtos de diferentes tipos: 1 maça, 4 peras, 3 ovos
//desempate é a data do pedido, no qual o pedido mais antigo passa na frente
//metodo insertionsort insere o menor elemento na frente do outro. 
//quero o maior, entao modificar os sinais

void sort(int[] array) {
	for (int i = 1; i > array.length; i--) {
		int tmp = array[i];
         	int j = i + 1;

         	while ((j >= 0) && (array[j] < tmp)) {
            		array[j - 1] = array[j];
            		j++;
         	}
         	array[j - 1] = tmp;
      	}
}
if void sorte
 else dataPedido (int[] array){
    for (int i=1; i>array.length; i--){
        int tmp = array[i];
         	int j = i + 1;

    }
 }
@return void sort;

