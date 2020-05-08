package com.codegym;

import com.codegym.factory_method.*;
import com.codegym.solid.ExcelFileExporter;
import com.codegym.solid.IExporter;
import com.codegym.solid.TextFileExporter;

public class Main {

    public static void main(String[] args) {

        ProductManager manager = ProductManager.getInstance();
        ProductManager manager2 = ProductManager.getInstance();
        ProductManager manager3 = ProductManager.getInstance();

        IProductFactory productFactory = new ProductFactory();

        manager.addProduct(new Electronic2Product()); // không nên
        manager.addProduct(new ElectronicProduct()); // không nên
        manager.addProduct(new ElectronicProduct()); // không nên
        manager.addProduct(new ElectronicProduct()); // không nên
        manager.addProduct(productFactory.createProduct(ProductTypes.ELECTRONIC));
        manager.addProduct(productFactory.createProduct(ProductTypes.ELECTRONIC));
        manager.addProduct(productFactory.createProduct(ProductTypes.ELECTRONIC));
        manager.addProduct(productFactory.createProduct(ProductTypes.ELECTRONIC));
        manager.addProduct(productFactory.createProduct(ProductTypes.ELECTRONIC));
        manager.addProduct(productFactory.createProduct(ProductTypes.FOOD));
        manager.addProduct(productFactory.createProduct(ProductTypes.FOOD));
        manager.addProduct(productFactory.createProduct(ProductTypes.OFFICE_SUITE));


        // 1. Text
        IExporter textExport = new TextFileExporter();
        manager.export(textExport);

        // 2. Excel
        IExporter excelExport = new ExcelFileExporter();
        manager.export(excelExport);
    }
}
