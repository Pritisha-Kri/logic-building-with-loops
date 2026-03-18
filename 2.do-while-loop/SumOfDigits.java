import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum = 0;
        do {
            sum += num % 10;
            num /= 10;
        } while (num != 0);

        System.out.println("Sum = " + sum);
    }
}