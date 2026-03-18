import java.util.Scanner;

class LargestUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, max = Integer.MIN_VALUE;

        do {
            System.out.print("Enter number (0 to stop): ");
            num = sc.nextInt();
            if (num != 0 && num > max) {
                max = num;
            }
        } while (num != 0);

        System.out.println("Largest = " + max);
    }
}