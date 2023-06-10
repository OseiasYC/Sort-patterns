package sort.patterns.sortcommand;

public class InsertionSortCommand implements Command {

    public Integer[] array;

    public InsertionSortCommand(Integer[] array) {
        this.array = array;
    }

    public Integer[] execute() {
        Integer[] array = this.array;

        int j;
        int key;
        int i;

        for (j = 1; j < array.length; j++) {
            key = array[j];
            for (i = j - 1; (i >= 0) && (array[i] > key); i--) {
                array[i + 1] = array[i];
            }
            array[i + 1] = key;
        }

        return array;
    }

}
