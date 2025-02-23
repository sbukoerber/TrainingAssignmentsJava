package Q4;
import java.util.Scanner;

public class Q4_pascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j,n,a[][];
        System.out.println("Enter the number of steps required:");
        n=input.nextInt();
        a=new int[n][n];

        for (i=0;i<n;i++) {
            for (j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                }
            }
        }
        System.out.println("\nOutPut:\n");
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
