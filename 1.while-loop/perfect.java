import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum =0;
        int i=1;

        while(i<num){
            if(num%i == 0){
                sum = sum + i;
            }
            i++;
        }

        if(num == sum){
            System.out.println("its a perfect no");
        }
        else{
            System.out.println("not a perfect no");
        }

        sc.close();
    }
}
