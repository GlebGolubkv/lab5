package FileManager.Json;

import DataClasses.MusicBand;

import java.util.Hashtable;

public class JsonParser {

    String fileName;

    public JsonParser(String fileName) {
        this.fileName = fileName;
    }


    public void WriteOneClassToFile(int key, MusicBand musicBand) {
        new JsonWriter(fileName, key, musicBand);

    }

    public void WriteLibraryToFile(Hashtable<Integer, MusicBand> Map) {
        new JsonWriter(fileName, Map);
    }

    public Hashtable<Integer, MusicBand> ReadAllClassesAtFile() {
        return new JsonReader(fileName).readFile();
    }

    public void CleanFile() {
        new JsonCleaner(fileName).cleanFile();

    }

    public String getCreationTimeOfFile() {
        return new JsonDateReader(fileName).getCreationTime();
    }



}
