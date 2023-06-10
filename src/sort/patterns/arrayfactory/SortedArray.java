package sort.patterns.arrayfactory;

public class SortedArray implements Array {

      public Integer[] array;

      public SortedArray(int size) {
            getArray(size);
      }

      public Array getArray(int size) {
            Integer[] array = new Integer[size];
            for (int i = 0; i < array.length; i++) {
                  array[i] = i;
            }
            this.array = array;
            return this;
      }

      public Integer[] returnArray() {
            return array;
      }
}
