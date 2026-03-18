import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num, sum = 0;

        do {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        } while (num != 0);

        if (sum == temp)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");

        sc.close();
    }
}