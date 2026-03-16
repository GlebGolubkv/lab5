package Data;

import FileManager.CommandsParser.CommandsReader;
import FileManager.Json.*;
import TermenalManager.BandsInputFromFile;
import TermenalManager.BandsInputManager;

public class InitializeManager {

    public static InitializeManager instance;

    private InitializeManager(String fileName) {

        Mapper.initialize();
        DataCommands.initialize();
        BandsInputManager.initialize();
        BandsInputFromFile.initialize();
        CommandsReader.initialize();
        JsonWriter.initialize(fileName);
        JsonReader.initialize(fileName);
        JsonParser.initialize();
        JsonDateReader.initialize(fileName);
        JsonCleaner.initialize(fileName);
        ClassesManager.initialize(fileName);

    }

    public static InitializeManager getInstance() {
        if (instance == null) {
            throw new RuntimeException("Data has not been initialized");
        }
        return instance;
    }

    public static void initialize(String fileName) {
        if (instance == null) {
            instance = new InitializeManager(fileName);
        } else {
            throw new RuntimeException("Data has not been initialized");
        }
    }
}
