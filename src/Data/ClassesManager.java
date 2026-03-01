package Data;

import DataClasses.MusicBand;
import FileManager.Json.JsonParser;
import TernemalManager.Colors;

import java.util.HashMap;
import java.util.Hashtable;

public class ClassesManager {

    public static Hashtable<Integer, MusicBand> Map = new Hashtable<>();
    public static String fileName;
    public HashMap<Integer, MusicBand> getMap;

    public ClassesManager() {
    }

    public ClassesManager(String fileName) {

        ClassesManager.fileName = fileName;
        Map = new JsonParser(fileName).ReadAllClassesAtFile();
    }

    public int MapSize() {
        return Map.size();
    }

    public String GetCreationDate() {
        return new JsonParser(fileName).getCreationTimeOfFile();
    }


    public String GetCollectionType() {
        return Colors.GREEN + "Collection Type: " + Colors.RESET + Map.getClass().getName();
    }


    public static Hashtable<Integer, MusicBand> getCopyOfMap() {
        return new Hashtable<>(Map); // копия
    }

    public Hashtable<Integer, MusicBand> GetMap() {
        return Map;
    }

    public void addMusicBandToCollection(int key, MusicBand mb) {
        Map.put(key, mb);
    }

    public void removeMusicBandFromCollection(int key) {
        Map.remove(key);
    }

    public boolean keyInMap(int key) {
        return Map.containsKey(key);
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Integer key : Map.keySet()) {
            s.append(Colors.GREEN)
                    .append("Key: ").append(Colors.RESET).append(key).append("\n")
                    .append(Colors.GREEN).append(" Value: ").append(Colors.RESET)
                    .append(Map.get(key).toString()).append("\n");

        }
        return s.toString();
    }

    public void SaveCollectionToFile() {
        JsonParser jsonParser = new JsonParser(fileName);
        jsonParser.WriteLibraryToFile(Map);
    }

    public void ClearCollection() {
        Map.clear();
    }

}
