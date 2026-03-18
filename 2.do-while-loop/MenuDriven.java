import java.util.Scanner;

class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add\n2. Exit");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Sum = " + (a + b));
            }

        } while (choice != 2);
    }
}