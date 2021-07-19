package main.java.projects.vessel;

import main.java.projects.materials.Material;

import java.io.Serializable;


public abstract class Vessel<T> implements Serializable {

    private double volume;
    private double diameter;
    private int weight;
    private Material material;

    public Vessel(double volume, double diameter, int weight, Material material) {
        this.volume = volume;
        this.diameter = diameter;
        this.weight = (int) ((material.getDensity() * volume) / 4);
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Vessel{" +
                "volume=" + volume +
                ", diameter=" + diameter +
                ", weight=" + weight +
                ", material=" + material +
                '}';
    }
}
