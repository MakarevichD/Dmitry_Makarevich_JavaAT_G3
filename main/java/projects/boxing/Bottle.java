package main.java.projects.boxing;

import main.java.projects.components.Bubble;
import main.java.projects.liquids.SparklingWater;
import main.java.projects.liquids.Transformable;
import main.java.projects.materials.Material;

public class Bottle extends Vessel implements Containable {

    private double volume;
    private SparklingWater water;

    public Bottle(double volume, double diameter, int weight, Material material, double volume1, SparklingWater water) {
        super(volume, diameter, weight, material);
        this.volume = volume1;
        this.water = water;
    }


    public Bottle(double volume) {
        this.volume = volume;
        Bubble[] bubbles = new Bubble[(int) (volume * 10000)];
    }

    public void open() {
        System.out.println("Open" + volume + "bottle cap");
        water.setOpened(true);
    }

    public void warm(int temperature) {
        System.out.println("Warm up a little bit");
        SparklingWater water = new SparklingWater();
        water.setTemperature(temperature);

    }

    public void getWater(SparklingWater water) {

    }

    public void setWater(SparklingWater water) {

    }

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }


    @Override
    public void close() {

    }


}






