package sort;

import java.util.Scanner;

import sort.patterns.metrictemplate.*;

public class Main {

    static SortTimeMetrics bubbleMetrics = new BubbleTimeMetrics();
    static SortTimeMetrics heapMetrics = new HeapTimeMetrics();
    static SortTimeMetrics insertionMetrics = new InsertionTimeMetrics();
    static SortTimeMetrics mergeMetrics = new MergeTimeMetrics();
    static SortTimeMetrics quickMetrics = new QuickTimeMetrics();
    static SortTimeMetrics selectionMetrics = new SelectionTimeMetrics();

    public static void main(String[] args) {
        Integer size = getSize();
        bubbleMetrics.showMetrics(size);
        heapMetrics.showMetrics(size);
        insertionMetrics.showMetrics(size);
        mergeMetrics.showMetrics(size);
        quickMetrics.showMetrics(size);
        selectionMetrics.showMetrics(size);
    }

    public static Integer getSize() {
        System.out.println("Digite o tamanho que o array terá:");
        Scanner in = new Scanner(System.in);
        Integer size = in.nextInt();
        in.close();
        return size;
    }

}