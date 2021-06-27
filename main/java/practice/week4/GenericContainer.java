package main.java.practice.week4;

public class GenericContainer <T> {

    private T [] objectsPlacement = (T[])new Object[10];
    int counter;


    public void add(T o) {

        if (counter < objectsPlacement.length) {
            objectsPlacement[counter++] = o;
        }
    }

    public T removeLast() {

        T result = null;

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



