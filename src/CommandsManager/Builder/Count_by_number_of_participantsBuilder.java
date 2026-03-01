package CommandsManager.Builder;

import CommandsManager.CommandBuilder;
import CommandsManager.Commands.Count_by_number_of_participants;

public class Count_by_number_of_participantsBuilder extends CommandBuilder {
    @Override
    public void createCommand() {
        System.err.println("Not supported yet.");
        System.out.println();
    }

    @Override
    public void createCommand(String value1) {
        new Count_by_number_of_participants().execute(value1);

    }

    @Override
    public String getCommandIfo() {
        return new Count_by_number_of_participants().commandInfo();
    }
}
