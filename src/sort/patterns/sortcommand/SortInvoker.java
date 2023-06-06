package sort.patterns.sortcommand;

import java.lang.reflect.Array;

public class SortInvoker {

    Command command;
    Array array;

    public SortInvoker() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public Integer[] executeCommand() {
        return command.execute();
    }
}
