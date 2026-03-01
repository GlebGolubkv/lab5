package CommandsManager.Builder;

import CommandsManager.CommandBuilder;
import CommandsManager.Commands.Insert;

public class InsertBuilder extends CommandBuilder {

    @Override
    public void createCommand() {
        System.err.println("Not supported yet.");
        System.out.println();
    }

    @Override
    public void createCommand(String value1) {
        new Insert().execute(value1);

    }

    @Override
    public String getCommandIfo() {
        return new Insert().commandInfo();
    }
}
