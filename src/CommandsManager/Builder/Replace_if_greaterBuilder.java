package CommandsManager.Builder;

import CommandsManager.CommandBuilder;
import CommandsManager.Commands.Replace_if_greater;

public class Replace_if_greaterBuilder extends CommandBuilder {
    @Override
    public void createCommand() {
        System.err.println("Not supported yet.");
        System.out.println();
    }

    @Override
    public void createCommand(String value1) {
     new Replace_if_greater().execute(value1);
    }

    @Override
    public String getCommandIfo() {
        return new Replace_if_greater().commandInfo();
    }
}
