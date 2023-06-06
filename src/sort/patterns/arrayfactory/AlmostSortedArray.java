package sort.patterns.arrayfactory;

public class AlmostSortedArray implements Array {

    public Integer[] array;

    public AlmostSortedArray(int size) {
        getArray(size);
    }

    public Array getArray(int size) {
        Integer[] vetor = new Integer[size];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }
        this.array = vetor;
        setArray(array);
        return this;
    }

    public void setArray(Integer[] array) {
        int x = (array.length * 80) / 100;
        for (int i = x; i < array.length; i++) {
            array[i] = (int) (Math.random() * (array.length));
        }
    }

    public Integer[] returnArray() {
        return array;
    }
}
