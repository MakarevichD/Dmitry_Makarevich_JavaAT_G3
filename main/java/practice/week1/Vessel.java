package main.java.practice.week1;

public abstract class Vessel {

    private int volume;
    private int height;
    private String material;
    private String color;

    public Vessel(int volume, int height, String material, String color) {
        this.volume = volume;
        this.height = height;
        this.material = material;
        this.color = color;
    }

    public Vessel() {
        this.volume = 200;
        this.height = 23;
        this.material = "plastic";
        this.color = "blue";
    }
    public Vessel(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}





