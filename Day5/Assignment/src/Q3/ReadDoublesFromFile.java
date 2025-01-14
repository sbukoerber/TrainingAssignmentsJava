package Q3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDoublesFromFile {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            Scanner scanner = new Scanner(file);

            double maxDouble = Double.NEGATIVE_INFINITY;

            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    double currentDouble = scanner.nextDouble();
                    if (currentDouble > maxDouble) {
                        maxDouble = currentDouble;
                    }
                } else {
                    scanner.next(); // skip non-double values
                }
            }

            scanner.close();

            if (maxDouble != Double.NEGATIVE_INFINITY) {
                System.out.println("The largest double in the file is: " + maxDouble);
            } else {
                System.out.println("No doubles found in the file.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}