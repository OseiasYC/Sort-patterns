package sort.patterns.metrictemplate;

import sort.GetArrays;
import sort.patterns.sortcommand.InsertionSortCommand;
import sort.patterns.sortcommand.SortInvoker;

public class InsertionTimeMetrics extends SortTimeMetrics {

    static GetArrays getArrays = new GetArrays();
    static SortInvoker invoker = new SortInvoker();

    public InsertionTimeMetrics() {
    }

    public long startTimeCounter() {
        return System.currentTimeMillis();
    }

    public long stopTimeCounter() {
        return System.currentTimeMillis();
    }

    public void printMethod(String sortingMethod, Integer size) {
        System.out.println("\nMétodo de ordenação: " + sortingMethod + "   |   Tamanho do array: " + size);
    }

    public void printTime(String arraySort, long tempoInicial, long tempoFinal) {
        System.out.println("O tempo necessário para a ordenação deste array " + arraySort + " foi de: "
                + (tempoFinal - tempoInicial) + " ms.");
    }

    public void sortInvoker(Integer size) {
        printMethod("Insertion Sort", size);
        String arraySort = "quase ordenado";
        long ini = startTimeCounter();
        invoker.setCommand(new InsertionSortCommand(getArrays.getAlmostSortedArray(size)));
        invoker.executeCommand();
        long fim = stopTimeCounter();
        printTime(arraySort, ini, fim);

        arraySort = "inversamente ordenado";
        ini = startTimeCounter();

        invoker.setCommand(new InsertionSortCommand(getArrays.getInverseArray(size)));
        invoker.executeCommand();
        fim = stopTimeCounter();
        printTime(arraySort, ini, fim);

        arraySort = "aleatório";
        ini = startTimeCounter();
        invoker.setCommand(new InsertionSortCommand(getArrays.getRandomArray(size)));
        invoker.executeCommand();
        fim = stopTimeCounter();
        printTime(arraySort, ini, fim);

        arraySort = "ordenado";
        ini = startTimeCounter();
        invoker.setCommand(new InsertionSortCommand(getArrays.getSortedArray(size)));
        invoker.executeCommand();
        fim = stopTimeCounter();
        printTime(arraySort, ini, fim);
    }
}
