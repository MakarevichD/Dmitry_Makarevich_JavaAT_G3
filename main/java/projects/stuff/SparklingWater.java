package main.java.projects.stuff;

import java.io.Serializable;
import java.util.List;

public class SparklingWater extends Water implements Serializable {

    private boolean isOpened;
    private List <Bubble> bubbles;

    public void SparklingWater() {
        isOpened();

    }

    public void setOpened(boolean opened) {
        this.isOpened = opened;

    }

    private void isOpened() {

    }

    public void pump(List<Bubble> pshBubbles) {
        bubbles = pshBubbles;


    }

    private void degas() {




    }

}
