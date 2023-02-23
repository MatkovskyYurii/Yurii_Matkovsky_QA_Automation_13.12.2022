package com.hiilel.lessons.Homework17;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProductMarket {
    private List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }

    public List<String> getAllProductNames() {
        List<String> productNames = new ArrayList<>();
        for (Product product : products) {
            productNames.add(product.getName());
        }
        return productNames;
    }

    public List<String> getAllProductNamesSortedAlphabetically() {
        List<String> productNames = getAllProductNames();
        Collections.sort(productNames);
        return productNames;
    }

    public List<Integer> getAllPricesGreaterThan10() {
        List<Integer> prices = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() > 10) {
                prices.add(product.getPrice());
            }
        }
        return prices;
    }

    public List<Integer> getAllPricesSmallerThan5() {
        List<Integer> prices = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() < 5) {
                prices.add(product.getPrice());
            }
        }
        return prices;
    }

    public List<String> getAllPricesAsString() {
        List<String> prices = new ArrayList<>();
        for (Product product : products) {
            prices.add(String.valueOf(product.getPrice()));
        }
        return prices;
    }


}
