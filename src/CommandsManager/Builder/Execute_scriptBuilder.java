package CommandsManager.Builder;

import CommandsManager.CommandBuilder;
import CommandsManager.Commands.Execute_script;

public class Execute_scriptBuilder extends CommandBuilder {
    @Override
    public void createCommand() {
        System.err.println("Not supported yet.");
        System.out.println();
    }

    @Override
    public void createCommand(String value1) {
        new Execute_script().execute(value1);

    }

    @Override
    public String getCommandIfo() {
        return new Execute_script().commandInfo();
    }
}
