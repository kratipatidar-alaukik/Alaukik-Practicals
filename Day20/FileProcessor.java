package Day20;

import java.io.File;
import java.util.Scanner;

class FileTask implements Runnable {

    String fileName;

    FileTask(String fileName) {
        this.fileName = fileName;
    }

    public void run() {

        try {
            Scanner sc = new Scanner(new File(fileName));

            int count = 0;

            while (sc.hasNext()) {
                sc.next();
                count++;
            }

            sc.close();

            System.out.println(fileName + " has " + count + " words");

        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}

public class FileProcessor {

    public static void main(String[] args) {

        Thread t1 = new Thread(new FileTask("file1.txt"));
        Thread t2 = new Thread(new FileTask("file2.txt"));
        Thread t3 = new Thread(new FileTask("file3.txt"));

        t1.start();
        t2.start();
        t3.start();
    }
}