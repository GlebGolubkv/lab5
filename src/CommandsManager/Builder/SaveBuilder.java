package CommandsManager.Builder;

import CommandsManager.CommandBuilder;
import CommandsManager.Commands.Save;

public class SaveBuilder extends CommandBuilder {
    @Override
    public void createCommand() {
        new Save().execute();

    }

    @Override
    public void createCommand(String value1) {
        System.err.println("Not supported yet.");
        System.out.println();

    }

    @Override
    public String getCommandIfo() {
        return new Save().commandInfo();
    }
}
