package sort.patterns.sortcommand;

public class QuickSortCommand implements Command {

	public Integer[] array;
	Integer inicio;
	Integer fim;

	public QuickSortCommand(Integer[] array) {
		this.array = array;
		this.inicio = 0;
		this.fim = array.length - 1;
	}

	public Integer[] execute() {
		Integer[] array = this.array;
		quickSort(array, inicio, fim);
		return array;
	}

	public void quickSort(Integer[] array, Integer inicio, Integer fim) {
		if (inicio < fim) {
			Integer posicaoPivo = separar(array, inicio, fim);
			quickSort(array, inicio, posicaoPivo - 1);
			quickSort(array, posicaoPivo + 1, fim);
		}
	}

	private Integer separar(Integer[] array, Integer inicio, Integer fim) {
		Integer pivo = array[inicio];
		Integer i = inicio + 1, f = fim;
		while (i <= f) {
			if (array[i] <= pivo)
				i++;
			else if (pivo < array[f])
				f--;
			else {
				Integer troca = array[i];
				array[i] = array[f];
				array[f] = troca;
				i++;
				f--;
			}
		}
		array[inicio] = array[f];
		array[f] = pivo;
		return f;
	}

}
