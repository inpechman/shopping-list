package com.sruly.stu.shopinglist;

import org.json.JSONObject;

import java.io.File;

/**
 * Created by stu on 4/17/2018.
 *
 */

public class Product {
    int barcode;
    String name;
    File image;
    Department department;

    public Product(int barcode, String name) {
        this.barcode = barcode;
        this.name = name;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public JSONObject toJson(){
        return null;
    }
}
