
import java.util.Scanner;

public class sumoffibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of terms");
        int n = sc.nextInt();

        int first=0;
        int second = 1;
        int next;

        int i =1;
        int sum = 0;

        while(i<=n){
            System.out.print(first+ " ");
            sum = sum+ first;

            next = first + second ;
            first = second;
            second = next;
            i++;

        }
        System.out.println("Sum of terms"+sum);

        sc.close();
    
    }

    
    
}
