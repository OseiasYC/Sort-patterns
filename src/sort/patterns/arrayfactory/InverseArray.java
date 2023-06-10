package sort.patterns.arrayfactory;

public class InverseArray implements Array {

    public Integer[] array;

    public InverseArray(int size) {
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
        for (int i = 0; i < array.length / 2; i++) {
            int x = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = x;
        }
    }

    public Integer[] returnArray() {
        return array;
    }

}
