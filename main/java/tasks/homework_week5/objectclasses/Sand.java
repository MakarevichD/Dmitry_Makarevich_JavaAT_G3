package main.java.tasks.homework_week5.objectclasses;

import java.util.Objects;

public class Sand {

    private String name;
    private int weight;

    public Sand(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sand sand = (Sand) o;
        return weight == sand.weight && Objects.equals(name, sand.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return "Sand{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
