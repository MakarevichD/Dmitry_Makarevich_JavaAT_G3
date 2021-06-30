package main.java.projects.boxing;

import main.java.projects.liquids.Transformable;

public interface Containable {

    void addStuff(Transformable stuff);

    Transformable removeStuff();

    boolean isEmpty();

    int getFreeSpace();

    void open();

    void close();

}
