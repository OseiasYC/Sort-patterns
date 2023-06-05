
import arrayfactory.*;
import metrictemplate.*;
import sortcommand.*;

public class Client {
    public static void main(String[] args) {

        /*
         * Pendências:
         * 
         * 1 - Os métodos de ordenaçao só estão funcionando em arrays inversamente
         * ordenados
         * 
         * 2 - O método mergeSort não funciona nem mesmo com o vetor iversamente
         * ordenado.
         * 
         * 3 - Organizar melhor a exibição das informações dos tempos de ordenação. / a
         * contagemde tempo não está
         * funcionando com o template Method
         * 
         * ------------------------------------------------------
         * 
         * 
         */

        long tempoInicial = 0;
        long tempoFinal = 0;

        ArrayFactory inverseArrayFactory = new InverseArrayFactory();
        ArrayFactory randomArrayFactory = new RandomArrayFactory();

        Array inverseArray10 = inverseArrayFactory.createArray(10);
        Array inverseArray100 = inverseArrayFactory.createArray(100);
        Array inverseArray1k = inverseArrayFactory.createArray(1000);
        Array inverseArray10k = inverseArrayFactory.createArray(10000);

        Array randomArray10 = randomArrayFactory.createArray(10);

        SortInvoker invoker = new SortInvoker();

        Metrics metrics = new MetricTemplate();

        // tempoInicial = System.currentTimeMillis();

        invoker.setCommand(new MergeSortCommand(inverseArray100.returnArray(), 0, 100));
        Integer[] array = invoker.executeCommand(metrics);
        // Integer[] array = inverseArray10.returnArray();

        // metric.ShowMetrics();

        // tempoFinal = System.currentTimeMillis();

        // System.out.println("\nO tempo necessário para a ordenação deste array é de: "
        // +
        // (tempoFinal - tempoInicial) + " milisegundos.");

        for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
        }

    }

}
