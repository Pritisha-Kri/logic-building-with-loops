public class factorial {
    public static void main(String[] args) {
        int n = 5;
        int f = 1;
        int i = 1;

        while(i <= n){
            f = f * i;
            i++;
        }

        System.out.println("The factorial is " + f);
    }
}