package CommandsManager.Commands;

import CommandsManager.Command;
import Data.ClassesManager;

public class Show extends Command {
    @Override
    public void execute() {

        System.out.println();
        System.out.println(new ClassesManager());
        System.out.println();

    }

    @Override
    public void execute(String value1) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public String commandInfo() {
        return "вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }
}
