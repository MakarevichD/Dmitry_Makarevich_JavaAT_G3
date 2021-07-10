package main.java.projects.factory;

import main.java.projects.boxing.Bottle;
import main.java.projects.boxing.Cup;
import main.java.projects.boxing.VesselBox;

public class Warehouse {

    VesselBox <Bottle> boxWithBottles = new VesselBox<>();
    VesselBox <Cup> boxWithCups = new VesselBox<>();

    String glassBottle;
    String ceramicCup;

    public Warehouse(String boxWithBottles, String boxWithCups) {


    }
}

