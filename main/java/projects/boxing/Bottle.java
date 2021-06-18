package main.java.projects.boxing;

import main.java.projects.components.Bubble;
import main.java.projects.liquids.SparklingWater;

public class Bottle {

    private double volume;
    private SparklingWater water;


    public Bottle(double volume) {
        this.volume = volume;
        Bubble[] bubbles = new Bubble[(int) (volume *10000)];
    }
    public void open (){
        System.out.println("Open"+ volume+ "bottle cap");
        water.setOpened(true);
    }

    public void warm (int temperature) {
        System.out.println("Warm up a little bit");
        SparklingWater water = new SparklingWater();
        water.setTemperature(temperature);


    }

    public void getWater(SparklingWater water) {

    }

    public void setWater(SparklingWater water) {

    }
}






