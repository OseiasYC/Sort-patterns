package sort.patterns.arrayfactory;

public class SortedArrayFactory extends ArrayFactory {

    @Override
    public Array getArray(int size) {
        return new SortedArray(size);
    }

}
