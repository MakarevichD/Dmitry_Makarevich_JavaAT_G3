package Day2.Homework.BubbleTask;

public abstract class Water {

    String color;
    String smell;
    int temperature;
    String transparancy;

    public Water () {
        this.color = "Colorless";
        this.temperature = 22;
        this.transparancy = "Pure";
        this.smell = "noSmell";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getTransparancy() {
        return transparancy;
    }

    public void setTransparancy(String transparancy) {
        this.transparancy = transparancy;
    }
}
