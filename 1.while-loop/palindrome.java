import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;   // store original number
        int rev = 0;

        while(n > 0) {
            int a = n % 10;
            rev = rev * 10 + a;
            n = n / 10;
        }

        System.out.println("reverse of number = " + rev);

        if(rev == original){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }

        sc.close();
    }
}