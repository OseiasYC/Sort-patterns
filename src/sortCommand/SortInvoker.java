package sortCommand;

import java.lang.reflect.Array;

import metricTemplate.MetricTemplate;
import metricTemplate.Metrics;

public class SortInvoker {
    
    Command command;
    Array array;

    public SortInvoker(){
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public Integer[] executeCommand(Metrics metrics ){
    	//Metrics metric = new MetricTemplate(); 
        metrics.ShowMetrics();
       return command.execute();
    }
}
