package Day2.Homework.BubbleTask;

public class Bubble {




    private String gasStructure;
    private float BUBBLE_VOL = 0.3f;


    public Bubble() {

    }

    public Bubble(String gasStructure) {
    this.gasStructure = gasStructure;

        System.out.println("Crump!");

    }

    public String getGasStructure() {
        return gasStructure;
    }

    public void setGasStructure(String gasStructure) {
        this.gasStructure = gasStructure;
    }

    public float getBUBBLE_VOL() {
        return BUBBLE_VOL;
    }

    public void setBUBBLE_VOL(float BUBBLE_VOL) {
        this.BUBBLE_VOL = BUBBLE_VOL;
    }
}



