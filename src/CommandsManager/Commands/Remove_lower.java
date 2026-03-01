package CommandsManager.Commands;

import CommandsManager.Command;
import Data.ClassesManager;
import DataClasses.MusicBand;
import TernemalManager.BandsInputManager;
import TernemalManager.Colors;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove_lower extends Command {
    @Override
    public void execute() {

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        ClassesManager classesManager = new ClassesManager();
        MusicBand InputMusicBand = new BandsInputManager().InputBand(scanner);
        ArrayList<String> RemoveKeys = new ArrayList<>();

        stringBuilder.append("Removed keys: " + Colors.GREEN);

        for (int key : classesManager.GetMap().keySet()) {
            if (InputMusicBand.compareTo(classesManager.GetMap().get(key)) > 0) {

                RemoveKeys.add(String.valueOf(key));
                stringBuilder.append( key).append(" ");
            }
        }
        stringBuilder.append(Colors.RESET);

        for (String key : RemoveKeys) {
            new Remove_key().execute(key);
        }
        System.out.println(stringBuilder);


    }

    @Override
    public void execute(String value1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String commandInfo() {
        return "удалить из коллекции все элементы, меньшие, чем заданный";
    }
}
