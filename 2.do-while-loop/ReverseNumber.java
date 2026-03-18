import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int rev = 0;
        do {
            rev = rev * 10 + num % 10;
            num /= 10;
        } while (num != 0);

        System.out.println("Reversed = " + rev);
    }
}