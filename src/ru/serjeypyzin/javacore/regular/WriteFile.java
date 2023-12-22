package ru.serjeypyzin.javacore.regular;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public void fileWriter(String filePath){
        FormingString formingString = new FormingString();

        String addToLine = formingString.formingString();

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))) {
            bufferedWriter.write(addToLine);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }


    }
}
