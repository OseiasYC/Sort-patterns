package sort;

import sort.patterns.arrayfactory.*;

public class GetArrays {

    ArrayFactory almostSortedArrayFactory = new AlmostSortedArrayFactory();
    ArrayFactory inverseArrayFactory = new InverseArrayFactory();
    ArrayFactory randomArrayFactory = new RandomArrayFactory();
    ArrayFactory sortedArrayFactory = new SortedArrayFactory();

    public Integer[] getAlmostSortedArray(Integer size) {
        Array almostSortedArray = almostSortedArrayFactory.createArray(size);
        return almostSortedArray.returnArray();
    }

    public Integer[] getInverseArray(Integer size) {
        Array inverseArray = inverseArrayFactory.createArray(size);
        return inverseArray.returnArray();
    }

    public Integer[] getRandomArray(Integer size) {
        Array randomArray = randomArrayFactory.createArray(size);
        return randomArray.returnArray();
    }

    public Integer[] getSortedArray(Integer size) {
        Array sortedArray = sortedArrayFactory.createArray(size);
        return sortedArray.returnArray();
    }

}
