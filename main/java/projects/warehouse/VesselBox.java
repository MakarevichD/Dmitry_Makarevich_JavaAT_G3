package main.java.projects.warehouse;

import main.java.projects.vessel.Containable;
import main.java.projects.vessel.Vessel;
import java.io.Serializable;
import java.util.List;


public class VesselBox<T extends Vessel> implements Serializable {

    private String name = " i'm box <%`d> of <%s>";
    private int capacity;
    private long id;
    private List <Containable> box;

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public long getId() {
        return id;
    }

    public List<Containable> getBox() {
        return box;
    }

}
