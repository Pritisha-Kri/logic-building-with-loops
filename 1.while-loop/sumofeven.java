public class sumofeven {
    public static void main(String[] args) {
        int n = 20;
        int sum = 0;
        int i = 1;

        while(i <= n){
            sum = sum + (2 * i);
            i++;
        }

        System.out.println("Sum of first 20 even numbers = " + sum);
    }
}