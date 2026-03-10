import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int n = sc.nextInt();

        int i = 1;
        int count = 0;
        while (i<=n){
            if(n%i==0){
                count++;
            }
            i++;
        }

        if(count == 2){
            System.err.println("no is prime");
        }
        else{
            System.out.println("not prime ");
        }

        sc.close();
    }
    
}
