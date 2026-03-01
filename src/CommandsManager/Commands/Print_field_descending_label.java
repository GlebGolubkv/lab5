package CommandsManager.Commands;

import CommandsManager.Command;
import Data.ClassesManager;
import DataClasses.MusicBand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

public class Print_field_descending_label extends Command {
    @Override
    public void execute() {

        ClassesManager classesManager = new ClassesManager();
        Hashtable<Integer, MusicBand> Map = classesManager.GetMap();
        ArrayList<Integer> labels = new ArrayList<>();
        for (int key : Map.keySet()) {
            labels.add(Map.get(key).getLabel().getBands());
        }
        Collections.sort(labels, Collections.reverseOrder());
        print_label(labels);


    }

    public void print_label(ArrayList<Integer> labels) {
        StringBuilder builder = new StringBuilder();
        builder.append("Labels: ");
        for (int i : labels) {
            builder.append(i).append(" ");
        }
        System.out.println();
        System.out.println(builder);
        System.out.println();
    }

    @Override
    public void execute(String value1) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public String commandInfo() {
        return "вывести значения поля label всех элементов в порядке убывания";
    }
}
