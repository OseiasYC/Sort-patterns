package metricTemplate;

public abstract class Metrics {
   
    public Metrics(){}
    long tempoInicial, tempoFinal;
    
    public void ShowMetrics(){
    	tempoInicial= startTimeCouter();
    	tempoFinal = stopTimeCouter();
        printMetrics(tempoInicial, tempoFinal);
    }

    public abstract long startTimeCouter();

    public abstract long stopTimeCouter();
    
    public abstract void printMetrics(long tempoInicial, long tempoFinal);
}
