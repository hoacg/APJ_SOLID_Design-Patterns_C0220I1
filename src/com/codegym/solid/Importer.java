package com.codegym.solid;

import java.util.List;

public interface Importer<T> {
    public List<T> doImport();
}
