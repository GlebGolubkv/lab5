package Data;


import DataClasses.MusicBand;

import java.util.Collections;
import java.util.Hashtable;

public class KeyGenerator {

    public int generateNewKey() {


        Hashtable<Integer, MusicBand> Map =  ClassesManager.getCopyOfMap();

        return Collections.max(Map.keySet()) + 1;
    }
}
