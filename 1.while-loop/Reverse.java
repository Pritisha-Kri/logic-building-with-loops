import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int rev =0;

        while(n > 0) {
            int a = n % 10;   // get last digit
            rev = rev * 10 + a;
            n = n / 10;          // remove last digit
        }

        System.out.println("reverse of number  = " + rev );
        sc.close();
    }
}