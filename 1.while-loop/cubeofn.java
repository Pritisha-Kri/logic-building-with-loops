import java.util.Scanner;

public class cubeofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        int i = 1;
        while (i<=n){
            int cube = i*i*i;
            System.out.print(cube + "  ");
            i++;
        }

        sc.close();

    }
    
}
