package sortCommand;

public class QuickSortCommand implements Command {

    public Integer[] array;
    int inicio;
    int fim;

    public  QuickSortCommand(Integer[] array, int inicio, int fim){
        this.array = array;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Integer[] execute(){
        Integer[] array = this.array;
       quickSort(array, inicio, fim);
        return array;
    }

    public void quickSort(Integer[] array, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(array, inicio, fim);
			quickSort(array, inicio, posicaoPivo - 1);
			quickSort(array, posicaoPivo + 1, fim);
		}
	}

    private int separar(Integer[] array, int inicio, int fim) {
		int pivo = array[inicio];
		int i = inicio + 1, f = fim;
		while (i <= f) {
			if (array[i] <= pivo)
				i++;
			else if (pivo < array[f])
				f--;
			else {
				int troca = array[i];
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
