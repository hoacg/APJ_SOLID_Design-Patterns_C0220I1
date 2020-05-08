package com.codegym.factory_method;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ProductFactory implements IProductFactory {

    @Override
    public Product createProduct(ProductTypes productTypes) {
        switch (productTypes) {
            case ELECTRONIC:
                return new Electronic2Product();
            case FOOD:
                return new FoodProduct();
            case CANDY:
                return new CandyProduct();
            case OFFICE_SUITE:
                return new OfficeSuiteProduct();
            default:
                throw new NotImplementedException();
        }
    }
}
