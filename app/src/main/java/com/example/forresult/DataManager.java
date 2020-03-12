package com.example.forresult;

import java.util.HashMap;

public class DataManager {

    private static boolean milk;
    private static boolean bread;
    private static boolean oil;
    private static boolean flour;
    private static boolean soap;

    public static HashMap<String, Boolean> getProductMap() {
        HashMap<String, Boolean> productMap = new HashMap<>();
        productMap.put("Milk" , milk);
        productMap.put("Bread" , bread);
        productMap.put("Oil", oil);
        productMap.put("Flour", flour);
        productMap.put("Soap", soap);
        return productMap;
    }
}
