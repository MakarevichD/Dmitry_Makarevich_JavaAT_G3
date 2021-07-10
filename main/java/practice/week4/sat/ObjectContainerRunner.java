package main.java.practice.week4.sat;

public class ObjectContainerRunner {

    public static void main(String[] args) {

        ObjectContainer objectContainer = new ObjectContainer();

        for (int i = 0; i < 10; i++) {
            objectContainer.add(i);
            objectContainer.add("bugagashka");

        }
        System.out.println(objectContainer + "created");

        for (int i = 0; i < 10; i++) {
            System.out.println(objectContainer.removeLast());

        }
        /*while (!objectContainer.isEmpty()) {
            Object object = objectContainer.removeLast();
            if (object instanceof Integer) {
                int integer = ((Integer) object);
                System.out.println("Number" + integer + "removed");
            }

        }*/


    }
}
