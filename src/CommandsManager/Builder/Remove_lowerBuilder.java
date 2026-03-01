package CommandsManager.Builder;

import CommandsManager.CommandBuilder;
import CommandsManager.Commands.Remove_lower;


public class Remove_lowerBuilder extends CommandBuilder {
    @Override
    public void createCommand() {
        new Remove_lower().execute();

    }

    @Override
    public void createCommand(String value1) {
        System.err.println("Not supported yet.");
        System.out.println();
    }

    @Override
    public String getCommandIfo() {
        return new Remove_lower().commandInfo();
    }
}
