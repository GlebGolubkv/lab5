package CommandsManager.Builder;

import CommandsManager.CommandBuilder;
import CommandsManager.Commands.Update;

public class UpdateBuilder extends CommandBuilder {
    @Override
    public void createCommand() {
        System.err.println("Not supported yet.");
        System.out.println();
    }

    @Override
    public void createCommand(String value1) {
        new Update().execute(value1);

    }

    @Override
    public String getCommandIfo() {
        return  new Update().commandInfo();
    }
}
