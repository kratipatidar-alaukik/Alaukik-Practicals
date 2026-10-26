package Day20;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class FileTask implements Runnable {

    String fileName;

    FileTask(String fileName) {
        this.fileName = fileName;
    }

    public void run() {

        try {
            Scanner sc = new Scanner(new File(fileName));

            int words = 0;

            while (sc.hasNext()) {
                sc.next();
                words++;
            }

            sc.close();

            System.out.println(
                    fileName + " contains " + words + " words"
            );

        } catch (Exception e) {
            System.out.println("Error reading " + fileName);
        }
    }
}

public class FileProcessor {

    public static void main(String[] args) {

        try {

            FileWriter f1 = new FileWriter("file1.txt");
            f1.write("Java is easy to learn");
            f1.close();

            FileWriter f2 = new FileWriter("file2.txt");
            f2.write("Multithreading allows multiple tasks");
            f2.close();

            FileWriter f3 = new FileWriter("file3.txt");
            f3.write("Java is used for backend development");
            f3.close();

            // Create threads
            Thread t1 = new Thread(new FileTask("file1.txt"));
            Thread t2 = new Thread(new FileTask("file2.txt"));
            Thread t3 = new Thread(new FileTask("file3.txt"));

            // Start threads
            t1.start();
            t2.start();
            t3.start();

        } catch (Exception e) {
            System.out.println("Error creating files");
        }
    }
}