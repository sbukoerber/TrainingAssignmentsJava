package Q1;

public class Q1_Fib {
    public float fibonacciSeries(){
        int m=1,n=1,p,sum=0, average;
        System.out.println("The first 20 Fibonacci numbers are:");
        System.out.print(m+" "+n);
        for(int i=1;i<=20;i++){
            sum=sum+m;
            p=m+n;
            System.out.print(" "+p);
            m=n;
            n=p;
        }
        average=sum/20;
        return average;
    }

    public static void main(String[] args) {
        Q1_Fib fib=new Q1_Fib();
        float avg= fib.fibonacciSeries();
        System.out.println("\nThe average is "+avg);
    }
}
