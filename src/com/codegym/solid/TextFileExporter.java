package com.codegym.solid;

import com.codegym.solid.IExporter;

import java.io.File;
import java.io.IOException;

public class TextFileExporter implements IExporter {
    @Override
    public void export() {
        try {
            File file = new File("./abc.txt");
            file.createNewFile();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
