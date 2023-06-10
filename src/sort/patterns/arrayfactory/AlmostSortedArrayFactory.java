package sort.patterns.arrayfactory;

public class AlmostSortedArrayFactory extends ArrayFactory {

    @Override
    public Array getArray(int size) {
        return new AlmostSortedArray(size);
    }

}
