package main.java.projects.boxing;

import main.java.projects.materials.Material;

public abstract class Vessel {

    private double volume;
    private double diameter;
    private int weight;
    private Material material;

    public Vessel(double volume, double diameter, int weight, Material material) {
        this.volume = volume;
        this.diameter = diameter;
        this.weight = weight;
        this.material = material;
    }
    public Vessel (){

    }
}
