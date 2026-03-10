import java.util.Scanner;

public class squareofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        int i = 1;
        while (i<=n){
            int square = i*i;
            System.out.print(square + "  ");
            i++;
        }

    }
    
}
