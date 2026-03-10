public class sumofn {
    public static void main(String[] args) {
        int n = 50;
        int sum = 0;
        int i = 1;

        while(i <= n){
            sum = sum + i;
            i++;
        }

        System.out.println("sum is " + sum);
    }
}