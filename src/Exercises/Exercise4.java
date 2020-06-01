package Exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Exercise4 implements Exercise {
    @Override
    public void start(){
        System.out.println("Exercise 4:\n");

        File file1 = writeToFile("file1", "Sample text");
        File file2 = writeToFile("file2", "Sample text");
        File file3 = writeToFile("file3", "Different text");
        compareFiles(file1, file2);
        compareFiles(file1, file3);
        printFileContent(file1);
        printFileContent(file2);
        printFileContent(file3);
    }

    private static void printFileContent(File file) {
        try {
            System.out.format("%s content: %s\n", file.getName() , Files.readString(file.toPath()));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void compareFiles(File file1, File file2) {
        try {
            if (Files.mismatch(file1.toPath(), file2.toPath()) == -1)
                System.out.format("Comparison: %s and %s content is the same\n", file1.getName(), file2.getName());
            else
                System.out.format("Comparison: %s and %s content is different\n", file1.getName(), file2.getName());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    private static File writeToFile(String path, String content){
        FileWriter fileWriter;
        File file = new File(path);
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return file;
    }
}
