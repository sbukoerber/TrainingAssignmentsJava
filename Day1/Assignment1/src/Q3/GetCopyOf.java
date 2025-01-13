package Q3;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class GetCopyOf {
    public static void main(String[] args) {
        int size;
        int[] arrayElements;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the size of an array:");
        size=input.nextInt();
        arrayElements=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the array elements: ");
            arrayElements[i]=input.nextInt();
        }
        int[] arrayCopy=Q3_CopyOf.copyOf(arrayElements);
        displayCopiedArray(arrayCopy);
    }
    public static void displayCopiedArray(int[] arrayCopy){
        int arraySize=arrayCopy.length;
        System.out.println("The copied array elements are: ");
        for(int i=0;i<arraySize;i++){
            System.out.print(" " +arrayCopy[i]);
        }
    }
}
