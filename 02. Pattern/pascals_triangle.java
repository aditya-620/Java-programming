//program to print pascals triangle
public class pascals_triangle {
    public static void printPascalsTriangle(int n){
        for (int i = 0; i < n; i++) {
              int number = 1;
              System.out.printf("%" + (n - i) * 2 + "s", "");
              for (int j = 0; j <= i; j++) {
                  System.out.printf("%4d", number);
                  number = number * (i - j) / (j + 1);
              }
              System.out.println();
          }
    }
    public static void main(String[] args) {
        int n = 8;
        printPascalsTriangle(n);
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-) 