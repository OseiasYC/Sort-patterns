package sort.patterns.sortcommand;

public class SelectionSortCommand implements Command {

	public Integer[] array;

	public SelectionSortCommand(Integer[] array) {
		this.array = array;
	}

	public Integer[] execute() {
		Integer[] array = this.array;

		for (int fixo = 0; fixo < array.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < array.length; i++) {
				if (array[i] < array[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				int t = array[fixo];
				array[fixo] = array[menor];
				array[menor] = t;
			}
		}

		return array;
	}
}
