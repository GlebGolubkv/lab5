package CommandsManager.Builder;

import CommandsManager.CommandBuilder;
import CommandsManager.Commands.Filter_less_than_label;
import Data.ClassesManager;
import DataClasses.MusicBand;

import java.util.Hashtable;

public class Filter_less_then_labelBuilder extends CommandBuilder {
    @Override
    public void createCommand() {
        System.err.println("Not supported yet.");
        System.out.println();
    }

    @Override
    public void createCommand(String value1) {
        new Filter_less_than_label().execute(value1);


    }

    @Override
    public String getCommandIfo() {
        return new Filter_less_than_label().commandInfo();
    }


}
