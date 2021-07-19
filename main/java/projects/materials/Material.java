package main.java.projects.materials;

public enum Material {

    GLASS(0.17, "green", 2100),
    PLASTIC(0.22, "white", 1800),
    METAL(58.00, "silver", 7800);


    private double thermalConductivity;
    private String color;
    private double density;

    Material(double thermalConductivity, String color, double density) {
        this.thermalConductivity = thermalConductivity;
        this.color = color;
        this.density = density;
    }

    public double getThermalConductivity() {
        return thermalConductivity;
    }

    public void setThermalConductivity(double thermalConductivity) {
        this.thermalConductivity = thermalConductivity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }
}
