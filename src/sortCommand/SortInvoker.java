package sortcommand;

import java.lang.reflect.Array;

import metrictemplate.MetricTemplate;
import metrictemplate.Metrics;

public class SortInvoker {

    Command command;
    Array array;

    public SortInvoker() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public Integer[] executeCommand(Metrics metrics) {
        // Metrics metric = new MetricTemplate();
        metrics.ShowMetrics();
        return command.execute();
    }
}
