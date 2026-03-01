package FileManager.Json;


import DataClasses.MusicBand;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.*;
import java.util.Hashtable;


public class JsonWriter {

    String fileName;

    public JsonWriter(String fileName) {
        this.fileName = fileName;
    }

    public JsonWriter(String fileName, int key, MusicBand musicBand) {
        this.fileName = fileName;

        //в oldMap записываем копию текущего файла
        Hashtable<Integer, MusicBand> oldMap = new JsonReader(fileName).readFile();


        // создает поток записи в файл. Перезаписывает с нуля
        try (FileOutputStream file = new FileOutputStream(fileName)) {


            // создаем и настраиваем мэппер
            ObjectMapper mapper = new ObjectMapper();
            //регаем новый модуль
            mapper.registerModule(new JavaTimeModule());
            //выставляем читаемую запись в файле
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            //выставляем отображение времени в файле
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            //записываем в файл
            mapper.writeValue(file, oldMap);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    // получает на вход сразу список значений
    public JsonWriter(String fileName, Hashtable<Integer, MusicBand> newMap) {
        this.fileName = fileName;



        //в oldMap записываем копию текущего файла

        // создает поток записи в файл.

        try (FileOutputStream file = new FileOutputStream(fileName)) {



            // создаем и настраиваем мэппер
            ObjectMapper mapper = new ObjectMapper();
            //регаем новый модуль
            mapper.registerModule(new JavaTimeModule());
            //выставляем читаемую запись в файле
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            //выставляем отображение времени в файле
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            //записываем в файл
            mapper.writeValue(file, newMap); // Jackson сам запишет в UTF-8


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

// есть мысль сделать перегрузку метода. На вход будет получать HashTable и записывать его полностью
