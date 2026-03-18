import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int fact = 1, i = 1;
        do {
            fact *= i;
            i++;
        } while (i <= n);

        System.out.println("Factorial = " + fact);
    }
}