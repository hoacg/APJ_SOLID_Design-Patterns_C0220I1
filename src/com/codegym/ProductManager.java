package com.codegym;

import com.codegym.factory_method.Product;
import com.codegym.solid.BookComparator;
import com.codegym.solid.IBookImporter;
import com.codegym.solid.IExporter;

import java.util.ArrayList;
import java.util.List;

public class ProductManager { // Singleton
    private static volatile ProductManager instance;

    private ProductManager() {}

    public static ProductManager getInstance() {
        if (instance == null) {
            synchronized (ProductManager.class) {
                instance = new ProductManager();
            }
        }

        return instance;
    }

    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {}
    public void updateProduct(int index, Product product) {}
    public void sort(BookComparator bookComparator) {}

    public void export(IExporter exporter) {

        exporter.export();

    }

    public void importBooks(IBookImporter bookImporter) {}
}
