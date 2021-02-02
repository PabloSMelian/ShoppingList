package model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private final String name;
    private List<Product> productList;

    public ShoppingList(String name) {
        this.name = name;
        productList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
