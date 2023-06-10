package sort.patterns.metrictemplate;

public class MetricTemplate extends Metrics {

    public MetricTemplate() {
    }

    public long startTimeCouter() {
        return System.currentTimeMillis();
    }

    public long stopTimeCouter() {
        return System.currentTimeMillis();
    }

    public void printMethod(String sortingMethod, Integer size) {
        System.out.println("\nMétodo de ordenação: " + sortingMethod + "   |   Tamanho do array: " + size);
    }

    public void printTime(String arraySort, long tempoInicial, long tempoFinal) {
        System.out.println("O tempo necessário para a ordenação deste array "+ arraySort +" foi de: " + (tempoFinal - tempoInicial) + " ms.");
    }

}