package main.java.projects.warehouse;


import java.io.*;
import java.nio.file.Path;

public class Stocktaking extends Warehouse{

    private static final Path FILE = Path.of("/Users/d.makarevich/");

    private Stocktaking(){


    }
    public static void registerBox( ) throws IOException {

        FileOutputStream addRecord = new FileOutputStream(String.valueOf(FILE));
        ObjectOutputStream addLists = new ObjectOutputStream(addRecord);

        addRecord.close();
        addLists.close();
    }

    public static void disposeBox( ) throws IOException {
        FileInputStream delRecord = new FileInputStream(String.valueOf(FILE));
        ObjectInputStream delLists = new ObjectInputStream(delRecord);
        delLists.close();
        delLists.close();
        delRecord.close();
    }

    public static void getInfo() {
        Warehouse getInfo = new Warehouse();


    }

    }

}
