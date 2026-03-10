public class sumofdigit {
    public static void main(String[] args) {
        int n = 13456;
        int sum = 0;

        while(n>0){
            int d= n%10;
            sum = sum +d;
            n=n/10;
        } 
        System.out.println("sum of digit is " + sum);
    }
}
