package main.java.projects.components;

public class Bubble {


    private String gas;
    public final double BUBBLE_VOLUME = 0.3d;


    public Bubble(String gas) {
        this.gas = gas;

    }

    public void bubbleBurst(){

        System.out.println("C-C-Crump!!");
    }

    public double getBUBBLE_VOLUME() {
        return BUBBLE_VOLUME;
    }
}

