package com.codegym.solid;

import java.awt.print.Book;
import java.util.List;

public interface IBookImporter extends Importer<Book> {
    List<Book> doImport();
}
