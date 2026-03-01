package FileManager.Json;

import DataClasses.MusicBand;

import java.util.Hashtable;

public class KeyTester {

    public KeyTester() {
    }

    public boolean KeyInMap(Hashtable<Integer, MusicBand> Map, Integer key) {

        return Map.containsKey(key);


    }
}
