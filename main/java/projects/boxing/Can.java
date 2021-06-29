package main.java.projects.boxing;

import main.java.projects.materials.Material;

public class Can extends Vessel implements Containable {

    public Can(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }
}
