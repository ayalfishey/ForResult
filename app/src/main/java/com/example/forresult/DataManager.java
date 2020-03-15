package com.example.forresult;

import java.util.HashMap;

public class DataManager {

    private static boolean milk;
    private static boolean bread;
    private static boolean oil;
    private static boolean flour;
    private static boolean soap;
    private static HashMap<String, Boolean> productMap;
            static{
                productMap = new HashMap<>();
                productMap.put("Milk" , milk);
                productMap.put("Bread" , bread);
                productMap.put("Oil", oil);
                productMap.put("Flour", flour);
                productMap.put("Soap", soap);
            };

    private DataManager(){
    }
    public static HashMap<String, Boolean> getProductMap() {
        return productMap;
    }
    public static void setMapVal(String key, boolean value){
        productMap.replace(key, Boolean.valueOf(value));
    }
    public static void clearData(){
        productMap.replace("Milk" , milk);
        productMap.replace("Bread" , bread);
        productMap.replace("Oil", oil);
        productMap.replace("Flour", flour);
        productMap.replace("Soap", soap);
    }
}
