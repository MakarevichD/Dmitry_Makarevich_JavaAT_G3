package main.java.projects.warehouse;

import main.java.projects.vessel.Bottle;

public class BottlingWater {

    public static void main(String[] args) {

        Bottle bottleS = new Bottle(0.5);
        Bottle bottleM = new Bottle(1.0);
        Bottle bottleL = new Bottle(1.5);

        bottleS.warm(15);
        bottleM.warm(4);
        bottleL.warm(22);

        bottleS.open();
        bottleM.open();
        bottleL.open();

    }
}
