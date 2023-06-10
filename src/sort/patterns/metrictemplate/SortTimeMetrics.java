package sort.patterns.metrictemplate;

public abstract class SortTimeMetrics {

    public SortTimeMetrics() {
    }

    public void showMetrics(Integer size) {
        sortInvoker(size);
    }

    public abstract void sortInvoker(Integer size);

    public abstract long startTimeCounter();

    public abstract long stopTimeCounter();

    public abstract void printMethod(String sortingMethod, Integer size);

    public abstract void printTime(String arraySort, long tempoInicial, long tempoFinal);

}
