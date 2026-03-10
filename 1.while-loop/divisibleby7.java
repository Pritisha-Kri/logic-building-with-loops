import java.util.Scanner;

public class divisibleby7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i=a;

        while(i<=b){
            if(i%7 ==0){
                System.out.println(i);
            }
            i++;

        }

        sc.close();

    }
    
}
