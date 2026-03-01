package CommandsManager.Builder;

import CommandsManager.CommandBuilder;
import CommandsManager.Commands.Clear;

public class ClearBuilder extends CommandBuilder {

    @Override
    public void createCommand() {
        new Clear().execute();
    }

    @Override
    public void createCommand(String value1) {
        System.err.println("Not supported yet.");
        System.out.println();
    }

    @Override
    public String getCommandIfo() {
        return new Clear().commandInfo();
    }
}
