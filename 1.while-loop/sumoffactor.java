import java.util.Scanner;

public class sumoffactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();

        int sum = 0;
        int i=1;
        while(i<n){
            if(n%i == 0){
                System.out.println(i);
                sum = sum + i;
            }
            i++;
        }
        System.out.println("the sum is " +sum);
        sc.close();
    
    }

    
    
}
