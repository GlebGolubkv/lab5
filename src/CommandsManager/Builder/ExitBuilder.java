package CommandsManager.Builder;

import CommandsManager.CommandBuilder;
import CommandsManager.Commands.Exit;

public class ExitBuilder extends CommandBuilder {
    @Override
    public void createCommand() {
        new Exit().execute();
    }

    @Override
    public void createCommand(String value1) {
        System.err.println("Not supported yet.");
        System.out.println();
    }

    @Override
    public String getCommandIfo() {
        return new Exit().commandInfo();
    }
}
