
import arrayFactory.*;
import metricTemplate.*;
import sortCommand.*;

public class Client {
    public static void main(String[] args) {

        ArrayFactory sortedArrayFactory = new SortedArrayFactory();
        ArrayFactory randomArrayFactory = new RandomArrayFactory();
        ArrayFactory inverseArrayFactory = new InverseArrayFactory();
        ArrayFactory almostSortedArrayFactory = new AlmostSortedArrayFactory();

        Array sortedArray10 = sortedArrayFactory.createArray(10);
        Array randomArray10 = randomArrayFactory.createArray(10);
        Array inverseArray10 = inverseArrayFactory.createArray(10);
        Array almostSortedArray10 = almostSortedArrayFactory.createArray(10);

        SortInvoker invoker = new SortInvoker();

        Metrics metrics = new MetricTemplate();

        invoker.setCommand(new MergeSortCommand(sortedArray10.returnArray(), sortedArray10.returnArray().length));
        Integer[] array = invoker.executeCommand(metrics);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        invoker.setCommand(new MergeSortCommand(randomArray10.returnArray(), randomArray10.returnArray().length));
        array = invoker.executeCommand(metrics);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        invoker.setCommand(new MergeSortCommand(inverseArray10.returnArray(), inverseArray10.returnArray().length));
        array = invoker.executeCommand(metrics);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        invoker.setCommand(
                new MergeSortCommand(almostSortedArray10.returnArray(), almostSortedArray10.returnArray().length));
        array = invoker.executeCommand(metrics);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /*
     * Pendências:
     * 
     * 3 - Organizar melhor a exibição das informações dos tempos de ordenação. / a
     * contagemde tempo não está
     * funcionando com o template Method
     */
}