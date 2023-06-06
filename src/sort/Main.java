package sort;

import java.util.Scanner;

import sort.patterns.metrictemplate.*;
import sort.patterns.sortcommand.*;

public class Main {

    static GetArrays getArrays = new GetArrays();
    static SortInvoker invoker = new SortInvoker();
    static Metrics metrics = new MetricTemplate();

    public static void main(String[] args) {
        Integer size = start();
        sortArrayBubble(size);
        sortArrayHeap(size);
        sortArrayInsertion(size);
        sortArrayMerge(size);
        sortArrayQuick(size);
        sortArraySelection(size);
    }

    public static Integer start() {
        System.out.println("Digite o tamanho que o array terá:");
        Scanner in = new Scanner(System.in);
        Integer size = in.nextInt();
        in.close();
        return size;
    }

    public static void sortArrayBubble(Integer size) {
        metrics.printMethod("Bubble Sort", size);
        String arraySort = "quase ordenado";
        long ini = metrics.startTimeCouter();
        invoker.setCommand(new BubbleSortCommand(getArrays.getAlmostSortedArray(size)));
        invoker.executeCommand();
        long fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "inversamente ordenado";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new BubbleSortCommand(getArrays.getInverseArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "aleatório";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new BubbleSortCommand(getArrays.getRandomArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "ordenado";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new BubbleSortCommand(getArrays.getSortedArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);
    }

    public static void sortArrayHeap(Integer size) {
        metrics.printMethod("Heap Sort", size);
        String arraySort = "quase ordenado";
        long ini = metrics.startTimeCouter();
        invoker.setCommand(new HeapSortCommand(getArrays.getAlmostSortedArray(size)));
        invoker.executeCommand();
        long fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "inversamente ordenado";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new HeapSortCommand(getArrays.getInverseArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "aleatório";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new HeapSortCommand(getArrays.getRandomArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "ordenado";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new HeapSortCommand(getArrays.getSortedArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);
    }

    public static void sortArrayInsertion(Integer size) {
        metrics.printMethod("Insertion Sort", size);
        String arraySort = "quase ordenado";
        long ini = metrics.startTimeCouter();
        invoker.setCommand(new InsertionSortCommand(getArrays.getAlmostSortedArray(size)));
        invoker.executeCommand();
        long fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "inversamente ordenado";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new InsertionSortCommand(getArrays.getInverseArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "aleatório";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new InsertionSortCommand(getArrays.getRandomArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "ordenado";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new InsertionSortCommand(getArrays.getSortedArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);
    }

    public static void sortArrayMerge(Integer size) {
        metrics.printMethod("Merge Sort", size);
        String arraySort = "quase ordenado";
        long ini = metrics.startTimeCouter();
        invoker.setCommand(new MergeSortCommand(getArrays.getAlmostSortedArray(size)));
        invoker.executeCommand();
        long fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "inversamente ordenado";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new MergeSortCommand(getArrays.getInverseArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "aleatório";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new MergeSortCommand(getArrays.getRandomArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "ordenado";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new MergeSortCommand(getArrays.getSortedArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);
    }

    public static void sortArrayQuick(Integer size) {
        metrics.printMethod("Quick Sort", size);
        String arraySort = "quase ordenado";
        long ini = metrics.startTimeCouter();
        invoker.setCommand(new QuickSortCommand(getArrays.getAlmostSortedArray(size)));
        invoker.executeCommand();
        long fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "inversamente ordenado";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new QuickSortCommand(getArrays.getInverseArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "aleatório";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new QuickSortCommand(getArrays.getRandomArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "ordenado";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new QuickSortCommand(getArrays.getSortedArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);
    }

    public static void sortArraySelection(Integer size) {
        metrics.printMethod("Selection Sort", size);
        String arraySort = "quase ordenado";
        long ini = metrics.startTimeCouter();
        invoker.setCommand(new SelectionSortCommand(getArrays.getAlmostSortedArray(size)));
        invoker.executeCommand();
        long fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "inversamente ordenado";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new SelectionSortCommand(getArrays.getInverseArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "aleatório";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new SelectionSortCommand(getArrays.getRandomArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);

        arraySort = "ordenado";
        ini = metrics.startTimeCouter();
        invoker.setCommand(new SelectionSortCommand(getArrays.getSortedArray(size)));
        invoker.executeCommand();
        fim = metrics.stopTimeCouter();
        metrics.printTime(arraySort, ini, fim);
    }
}