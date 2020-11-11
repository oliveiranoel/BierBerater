package io.vsia.bierberater;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrand(String color) {
        List<String> brands = new ArrayList<String>();

        switch (color) {
            case "hell":
                brands.add("Burgdorfer Hell");
                brands.add("Feldschlösschen Original");
                break;
            case "amber":
                brands.add("Bärner Amber Bier");
                brands.add("Feldschlösschen Amber");
                break;
            case "dunkel":
                brands.add("Burgdorfer Aemme");
                brands.add("Feldschlösschen Dunkle Perle");
                break;
            default:
                brands.add("kein Bier gefunden");
        }
        return brands;
    }
}
