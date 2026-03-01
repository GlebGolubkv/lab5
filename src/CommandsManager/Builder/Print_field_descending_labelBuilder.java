package CommandsManager.Builder;

import CommandsManager.CommandBuilder;
import CommandsManager.Commands.Print_field_descending_label;

public class Print_field_descending_labelBuilder extends CommandBuilder {
    @Override
    public void createCommand() {
        new Print_field_descending_label().execute();
    }

    @Override
    public void createCommand(String value1) {
        System.err.println("Not supported yet.");
        System.out.println();
    }

    @Override
    public String getCommandIfo() {
        return new Print_field_descending_label().commandInfo();
    }
}
