package sort.patterns.arrayfactory;

public abstract class ArrayFactory {
    public Array createArray(int size) {
        Array array = getArray(size);
        return array;
    }

    public abstract Array getArray(int size);

}
