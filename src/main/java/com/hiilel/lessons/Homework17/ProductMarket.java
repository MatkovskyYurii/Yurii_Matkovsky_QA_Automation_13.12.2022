package com.hiilel.lessons.Homework17;


import java.util.List;
import java.util.stream.Collectors;


public class ProductMarket {
    private List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }

    public List<String> getAllProductNames() {
        return products
                .stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }

    public List<String> getAllProductNamesSortedAlphabetically() {
        List<String> productNames = getAllProductNames();
        return productNames
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Integer> getAllPricesGreaterThan10() {
        return products
                .stream()
                .map(Product::getPrice)
                .filter(p -> p > 10)
                .collect(Collectors.toList());
    }

    public List<Integer> getAllPricesSmallerThan5() {
        return products
                .stream()
                .map(Product::getPrice)
                .filter(p -> p < 5)
                .collect(Collectors.toList());
    }

    public List<String> getAllPricesAsString() {
        return products
                .stream()
                .map(Product::getPrice)
                .map(Object::toString)
                .collect(Collectors.toList());
    }


}
