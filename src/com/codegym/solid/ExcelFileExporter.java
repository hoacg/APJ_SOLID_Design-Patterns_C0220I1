package com.codegym.solid;

import java.io.File;
import java.io.IOException;

public class ExcelFileExporter implements IExporter {
    @Override
    public void export() {
        try {
            File file = new File("./abc.xls");
            file.createNewFile();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
