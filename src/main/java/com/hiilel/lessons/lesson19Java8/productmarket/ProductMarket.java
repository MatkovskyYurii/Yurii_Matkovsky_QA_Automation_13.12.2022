package com.hiilel.lessons.lesson19Java8.productmarket;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {

    private List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Product> getProductPriceLess100() {
        return products
                .stream()
                .filter(p -> p.getPrice() < 100)
                .collect(Collectors.toList());
    }

    public List<String> getProductNames() {
        return products
                .stream()
                .map(p -> p.getName())
                .collect(Collectors.toList());
    }

}
