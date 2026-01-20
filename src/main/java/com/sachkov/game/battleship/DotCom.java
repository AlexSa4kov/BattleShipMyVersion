package main.java.com.sachkov.game.battleship;

import java.util.*;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;
    //private int numOfHits = 0;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Потопил";
                System.out.println("Вы потопили " + name);
            } else {
                result = "Попал";
            }
        }

        System.out.println(result);
        return result;
    }
}