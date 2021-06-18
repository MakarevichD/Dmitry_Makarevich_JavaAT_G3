package Day2.Homework.BubbleTask;

public abstract class Water {

    String color;
    String smell;
    int temperature;
    String transparency;

    public Water () {
        this.color = color;
        this.temperature = temperature;
        this.transparency = transparency;
        this.smell = smell;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }
}
