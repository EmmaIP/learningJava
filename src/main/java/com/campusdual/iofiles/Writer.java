package com.campusdual.iofiles;

import com.campusdual.Utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Writer {
    public static void main(String[] args) {
        //ruta del fichero
        Path filePath = Paths.get(Route.PATH_NAME);
        //try with resources
        try(PrintWriter pw = new PrintWriter(new FileWriter(filePath.toFile()))){
            pw.println("Almacena una cadena");
            for (int i = 0; i < 10; i++) {
                int randomNumber = Utils.getRandomNumberInRange(1, 100);
                pw.println(randomNumber);
            }

        }catch (IOException e) {  //captura el error que puede dar el FileWriter
            e.printStackTrace();
        }

    }

}
