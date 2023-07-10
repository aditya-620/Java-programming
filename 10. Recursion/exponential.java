public class exponential {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int value = x * power(x , n-1);
        return value;
    }
    public static void main(String args[]){
        System.out.println(power(2,10));
    }
}
