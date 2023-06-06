package sort.patterns.sortcommand;

import java.lang.Comparable;

public class HeapSortCommand implements Command {

	public Integer[] array;

	public HeapSortCommand(Integer[] array) {
		this.array = array;
	}

	public Integer[] execute() {
		Integer[] array = this.array;
		heapSort(array);
		return array;
	}

	public void heapSort(Comparable[] a) {
		for (int i = a.length / 2; i >= 0; i--) /* buildHeap */
			percDown(a, i, a.length);
		for (int i = a.length - 1; i > 0; i--) {
			swapReferences(a, 0, i); /* deleteMax */
			percDown(a, 0, i);
		}
	}

	private void percDown(Comparable[] a, int i, int n) {
		int child;
		Comparable tmp;

		for (tmp = a[i]; leftChild(i) < n; i = child) {
			child = leftChild(i);
			if (child != n - 1 && a[child].compareTo(a[child + 1]) < 0)
				child++;
			if (tmp.compareTo(a[child]) < 0)
				a[i] = a[child];
			else
				break;
		}
		a[i] = tmp;
	}

	private int leftChild(int i) {
		return 2 * i + 1;
	}

	private void swapReferences(Object[] a, int index1, int index2) {
		Object tmp = a[index1];
		a[index1] = a[index2];
		a[index2] = tmp;
	}

}
