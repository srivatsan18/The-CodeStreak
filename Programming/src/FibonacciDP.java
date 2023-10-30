import java.util.Scanner;

public class FibonacciDP {

    public static int getFibonacci(int n){
        int [] fibonacci = new int[n+1];
        fibonacci[0] = 0;
        fibonacci[1]= 1;
        for(int i=2;i<=n;i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
            return fibonacci[n];
    }
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        n = obj.nextInt();
        System.out.println(getFibonacci(n));
    }
}
