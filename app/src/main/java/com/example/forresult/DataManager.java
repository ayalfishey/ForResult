package com.example.forresult;

public class DataManager {

    private static boolean milk;
    private static boolean bread;
    private static boolean oil;
    private static boolean flour;
    private static boolean soap;

    public static boolean isMilk() {
        return milk;
    }

    public static void setMilk(boolean milk) {
        DataManager.milk = milk;
    }

    public static boolean isBread() {
        return bread;
    }

    public static void setBread(boolean bread) {
        DataManager.bread = bread;
    }

    public static boolean isOil() {
        return oil;
    }

    public static void setOil(boolean oil) {
        DataManager.oil = oil;
    }

    public static boolean isFlour() {
        return flour;
    }

    public static void setFlour(boolean flour) {
        DataManager.flour = flour;
    }

    public static boolean isSoap() {
        return soap;
    }

    public static void setSoap(boolean soap) {
        DataManager.soap = soap;
    }
}
