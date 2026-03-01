package FileManager.Json;

import java.io.FileOutputStream;
import java.io.IOException;

public class JsonCleaner {

    String fileName;

    public JsonCleaner(String fileName) {
        this.fileName = fileName;
    }

    public void cleanFile() {
        try (FileOutputStream file = new FileOutputStream(fileName)) {
            //ничего не вызывается, файл перезаписывается в нулевой
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
