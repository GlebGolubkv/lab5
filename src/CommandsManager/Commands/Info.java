package CommandsManager.Commands;

import CommandsManager.Command;
import Data.ClassesManager;
import TernemalManager.Colors;

public class Info extends Command {
    @Override
    public void execute() {

        ClassesManager cm = new ClassesManager();
        System.out.println();
        System.out.println(cm.GetCollectionType());
        System.out.println(cm.GetCreationDate());
        System.out.println(Colors.GREEN + "Map size: " + Colors.RESET + cm.MapSize());
        System.out.println();


    }

    @Override
    public void execute(String value1) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public String commandInfo() {
        return "вывести в стандартный поток вывода информацию о коллекции";
    }
}
