package sort.patterns.sortcommand;

public class BubbleSortCommand implements Command {

	public Integer[] array;

	public BubbleSortCommand(Integer[] array) {
		this.array = array;
	}

	public Integer[] execute() {
		Integer[] array = this.array;

		boolean troca = true;
		int aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					aux = array[i];
					array[i] = array[i + 1];
					array[i + 1] = aux;
					troca = true;
				}
			}
		}

		return array;
	}

}
