package FileManager.CommandsParser;

import Data.DataCommands;
import TernemalManager.Colors;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CommandsReader {


    public CommandsReader() {

    }

    public void readCommands(String fileName) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName.trim()));

            String line;
            while ((line = bufferedReader.readLine()) != null) {

                new DataCommands().createCommandByName(line);
                System.out.println("Command " + line + " done");

            }

        } catch (IOException e) {
            System.out.println();
            System.out.println(Colors.RED + "There is no file with this name." +  Colors.RESET);

        }
    }
}
