import java.util.Scanner;

class CountPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count = 0;

        do {
            System.out.print("Enter number: ");
            num = sc.nextInt();
            if (num > 0) count++;
        } while (num >= 0);

        System.out.println("Positive count = " + count);
        sc.close();
    }
}