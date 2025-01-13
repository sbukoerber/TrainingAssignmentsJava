package LabAssesment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Merchandise {
    String ItemId;
    int Qty;
    double price;

    public Merchandise(String ItemId, int Qty, double price) {
        this.ItemId = ItemId;
        this.Qty = Qty;
        this.price = price;
    }

    public String toString() {
        return ItemId + " " + Qty + " " + price;
    }
}

public class Lab1_MerchandiseInventoryTest {
    public static void main(String[] args) {
        ArrayList<Merchandise> merchandises = new ArrayList<>(15);

        try {
            File inputFile = new File("C:\\TrainingProgram\\Assisgnment\\CoreJava\\LabAssesment1\\Assesment1\\input.dat");
            Scanner scanner = new Scanner(inputFile);
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(" ");
                Merchandise merchandise = new Merchandise(data[0], Integer.parseInt(data[1]), Double.parseDouble(data[2]));
                merchandises.add(merchandise);
            }
            scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            }

        // Sort by item code in ascending order
        Collections.sort(merchandises, (a, b) -> a.ItemId.compareTo(b.ItemId));
        System.out.println("Sorted by item code in ascending order:");
        for (Merchandise merchandise : merchandises) {
            System.out.println(merchandise);
        }

        // Sort by price in descending order
        Collections.sort(merchandises, (a, b) -> Double.compare(b.price, a.price));
        System.out.println("Sorted by price in descending order:");
        for (Merchandise merchandise : merchandises) {
            System.out.println(merchandise);
        }
    }
}