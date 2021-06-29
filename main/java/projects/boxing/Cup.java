package main.java.projects.boxing;

import main.java.projects.materials.Material;

public class Cup extends Vessel implements Containable{

    public Cup(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }
}
