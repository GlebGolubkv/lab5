package CommandsManager.Commands;

import CommandsManager.Builder.ClearBuilder;
import CommandsManager.Command;
import Data.ClassesManager;
import TernemalManager.Colors;

public class Clear extends Command {
    @Override
    public void execute() {
        new ClassesManager().ClearCollection();
        System.out.println();
        System.out.println(Colors.GREEN + "Collection cleared" + Colors.RESET);
        System.out.println();

    }

    @Override
    public void execute(String value1) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public String commandInfo() {
        return "очистить коллекцию";
    }
}
