package CommandsManager.Builder;

import CommandsManager.CommandBuilder;
import CommandsManager.Commands.Show;

public class ShowBuilder extends CommandBuilder {

    @Override
    public void createCommand() {
       new Show().execute();
    }

    @Override
    public void createCommand(String value1) {
        System.err.println("Not supported yet.");
        System.out.println();
    }

    @Override
    public String getCommandIfo() {
        return new Show().commandInfo();
    }
}

