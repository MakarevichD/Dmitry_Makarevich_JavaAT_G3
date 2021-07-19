package main.java.projects.stuff;

public class Bubble {


    private String gas;
    public final double BUBBLE_VOLUME = 0.3d;


    public Bubble(String gas) {
        this.gas = gas;

    }

    public void crump() {

        System.out.println("C-C-Crump!!" + gas);

    }

    public double getBUBBLE_VOLUME() {
        return BUBBLE_VOLUME;
    }
}

