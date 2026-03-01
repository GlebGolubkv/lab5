package CommandsManager.Commands;

import CommandsManager.Command;
import TernemalManager.Colors;



public class Exit extends Command {
    @Override
    public void execute() {
        System.out.println(Colors.GREEN + "Exit Program" + Colors.RESET);
        System.exit(0);
    }

    @Override
    public void execute(String value1) {

        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public String commandInfo() {
        return "завершить программу";
    }
}
