package com.campusdual.json;

import com.campusdual.Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static java.nio.file.Files.createFile;

public class JsonFileCreator {

    private static void createFile(){
        //creamos el objeto inicio del Json
        JsonObject computer = new JsonObject();
        //creamos el array de componentes
        JsonArray componentsArray = new JsonArray();
        //creamos el componente, le metemos la clave valor, lo añadimos al array
        componentsArray.add(createItem(2, "Graphic Card"));
        componentsArray.add(createItem(1, "CPU"));
        componentsArray.add(createItem(3, "Fan"));
        componentsArray.add(createItem(1, "Mother board"));
        componentsArray.add(createItem(2, "RAM"));
        componentsArray.add(createItem(1, "SSD"));
        componentsArray.add(createItem(1, "Power supply"));
        componentsArray.add(createItem(1, "Computer case"));
        //se le añade a computer el array de componentes
        computer.add("components", componentsArray);

        try(FileWriter fw = new FileWriter("src/main/resources/computerList.json")){
            //le añadimos para que escriba en líneas separadas
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(computer);
            //ahora ya lo escribe
            fw.write(json);
            //limpia el flujo de datos
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static JsonObject createItem(int quantity, String itemDesc){
        JsonObject component = new JsonObject();
        component.addProperty("quantity", quantity);
        component.addProperty("text", itemDesc);
        return component;

    }
    public static void main(String[] args) {

        JsonFileCreator.createFile();
    }

}
