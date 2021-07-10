package main.java.tasks.homework_week5.objectclasses;

import java.util.Objects;

public class Chair {

    private int weight;
    private int height;

    public Chair(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return weight == chair.weight && height == chair.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
