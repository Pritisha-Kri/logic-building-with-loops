import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of terms");
        int n = sc.nextInt();

        int first=0;
        int second = 1;
        int next;

        int i =1;

        while(i<=n){
            System.out.println(first+ " ");
            next = first + second ;
            first = second;
            second = next;
            i++;

        }

        sc.close();
    
    }

    
    
}
