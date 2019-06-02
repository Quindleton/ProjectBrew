package MemoryDust.RPGElements;

import java.util.ArrayList;

public class Room {

    private ArrayList<Figment> allFigments;

    public void build(){
        allFigments = new ArrayList<>();
        allFigments.add(new Figment("Quinn"));
        allFigments.add(new Figment("Eve"));
    }
    public ArrayList<Figment> getFigments(){
        return allFigments;
    }
}

