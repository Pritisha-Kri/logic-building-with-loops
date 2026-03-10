import java.util.Scanner;

public class Digitcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count =0;

        while(n > 0) {
            count = count+1;
            n = n / 10;          // remove last digit
        }

        System.out.println("no of digit = " + count);
        sc.close();
    }
}