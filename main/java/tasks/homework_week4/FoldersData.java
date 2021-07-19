package main.java.tasks.homework_week4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class FoldersData {

    public void DeepFolderFiles() throws IOException {

        Path path = Paths.get("/Users/d.makarevich/ideaprojects/src/main/java/tasks/homework_week4/folder1/folder2/folder3/folder4/");
        Files.createDirectories(path);
        String pathForFile = path.normalize().toString().concat(path.normalize().getRoot().toString());
        File newFile1 = new File(pathForFile + "1.txt");
        File newFile2 = new File(pathForFile + "2.txt");


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile1));

        bufferedWriter.write("0123456789");
        bufferedWriter.close();

        BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(newFile2));
        for (int i = 0; i < 10; i++) {
            String str = String.valueOf(((int) (1 + (Math.random() * 10)) + " "));
            bufferedWriter2.write(str);
        }

        bufferedWriter2.close();

    }
}
