package CommandsManager.Builder;

import CommandsManager.CommandBuilder;
import CommandsManager.Commands.Help;

public class HelpBuilder extends CommandBuilder {
    @Override
    public void createCommand() {
        new Help().execute();
    }

    @Override
    public void createCommand(String value1) {
        System.err.println("Not supported yet.");
        System.out.println();
    }

    @Override
    public String getCommandIfo() {
        return new Help().commandInfo();
    }
}
