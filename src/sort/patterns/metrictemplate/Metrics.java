package sort.patterns.metrictemplate;

public abstract class Metrics {

    public Metrics() {
    }

    public abstract long startTimeCouter();

    public abstract long stopTimeCouter();

    public abstract void printMethod(String sortingMethod, Integer size);

    public abstract void printTime(String arraySort, long tempoInicial, long tempoFinal);
}
