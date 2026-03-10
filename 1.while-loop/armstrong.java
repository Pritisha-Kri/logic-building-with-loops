import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int original = n;

        // count digits
        int count = 0;
        int temp = n;

        while(temp > 0){
            count++;
            temp = temp / 10;
        }

        // sum of powers
        int sum = 0;
        temp = n;

        while(temp > 0){
            int a = temp % 10;
            int pow = (int)Math.pow(a, count);
            sum = sum + pow;
            temp = temp / 10;
        }

        // check Armstrong
        if(sum == original){
            System.out.println("The number is Armstrong");
        }
        else{
            System.out.println("The number is not Armstrong");
        }

        sc.close();
    }
}