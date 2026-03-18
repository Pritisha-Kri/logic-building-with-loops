import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num, rev = 0;

        do {
            rev = rev * 10 + num % 10;
            num /= 10;
        } while (num != 0);

        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}