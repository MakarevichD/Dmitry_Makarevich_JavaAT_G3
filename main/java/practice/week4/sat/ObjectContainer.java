package main.java.practice.week4.sat;

public class ObjectContainer {

    private Object[] objectsPlacement = new Object[10];
    int counter;


    public void add(Object o) {

        if (counter < objectsPlacement.length) {
            objectsPlacement[counter++] = o;
        }
    }

    public Object removeLast() {

        Object result = null;

        if (counter > 0) {
            result = objectsPlacement[counter - 1];
            objectsPlacement[--counter] = null;

        }
        return result;
    }

    public boolean isEmpty() {

        return counter == 0;
    }


}







