package sort.patterns.arrayfactory;

public class RandomArray implements Array {

    public Integer[] array;

    public RandomArray(int size) {
        getArray(size);
    }

    public Array getArray(int size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        this.array = array;
        setArray(array, size);
        return this;
    }

    public void setArray(Integer[] array, int size) {
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = (int) (Math.random() * size);
        }
    }

    public Integer[] returnArray() {
        return array;
    }

}
