package metricTemplate;

public class MetricTemplate extends Metrics{
    
   
    public MetricTemplate(){}

    public long startTimeCouter(){
    return System.currentTimeMillis();
    }
    
    public long stopTimeCouter(){
    	return System.currentTimeMillis();
    }
    
    public void printMetrics(long tempoInicial, long tempoFinal){
       	System.out.println("\nO tempo necessário para a ordenação deste array é de: " + (tempoFinal - tempoInicial) + " milisegundos.");
       	
    	//System.out.println("testando");
    	//stopTimeCounter();
        
        
    }
    
    


    /*
     *  ArrayFactory SortedArrayFactory = new SortedArrayFactory();
        ArrayFactory InverseArrayFactory = new InverseArrayFactory();
        ArrayFactory AlmostSortedArrayFactory = new AlmostSortedArrayFactory();
        ArrayFactory RandomArrayFactory = new RandomArrayFactory();
    */
}
