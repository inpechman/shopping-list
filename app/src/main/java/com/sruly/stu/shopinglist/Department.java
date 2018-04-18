package com.sruly.stu.shopinglist;

import java.util.ArrayList;

/**
 * Created by stu on 4/17/2018.
 *
 */

public class Department extends Product {
    ArrayList<Product> products = new ArrayList<>();

    public Department(int barcode, String name) {
        super(barcode, name);
    }

    public boolean addProduct(Product product) {
        return products.add(product);
    }

    public boolean removeProduct(Product product) {
        return products.remove(product);
    }
}
