import java.util.Scanner;

class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = 1, hcf = 1;

        do {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
            i++;
        } while (i <= a && i <= b);

        System.out.println("HCF = " + hcf);
    }
}