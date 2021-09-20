package main.java.projects.warehouse;

import main.java.projects.materials.Material;
import main.java.projects.stuff.Transformable;

public class Factory {

    private Warehouse warehouse;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void createVesselBox(int capacity, double volume, Material material, Transformable stuff, Class<?> clazz) {

    }

    private void createVessel(double volume, Material material, Transformable stuff, Class<?> clazz) {

    }
}
