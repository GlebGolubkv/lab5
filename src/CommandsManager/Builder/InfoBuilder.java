package CommandsManager.Builder;

import CommandsManager.CommandBuilder;
import CommandsManager.Commands.Info;

public class InfoBuilder extends CommandBuilder {
    @Override
    public void createCommand() {
        new Info().execute();
    }

    @Override
    public void createCommand(String value1) {
        System.err.println("Not supported yet.");
        System.out.println();
    }

    @Override
    public String getCommandIfo() {
        return new Info().commandInfo();
    }
}
