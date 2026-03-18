import java.util.Scanner;

class EvenOddDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int evenSum = 0, oddSum = 0;

        do {
            int digit = num % 10;
            if (digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;

            num /= 10;
        } while (num != 0);

        System.out.println("Even sum = " + evenSum);
        System.out.println("Odd sum = " + oddSum);

        sc.close();
    }
}