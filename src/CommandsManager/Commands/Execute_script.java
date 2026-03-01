package CommandsManager.Commands;

import CommandsManager.Command;
import FileManager.CommandsParser.CommandsReader;

public class Execute_script extends Command {
    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void execute(String value1) {
        System.out.println();
        System.out.println("Read commands from file");
        System.out.println();
        new CommandsReader().readCommands(value1);

    }

    @Override
    public String commandInfo() {
        return "считать и исполнить скрипт из указанного файла";
    }
}
