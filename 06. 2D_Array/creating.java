//Creating a 2D ARRAY
import java.util.Scanner;

public class creating {
    public static void main(String args[]){
        int matrix[][] = new int[3][3];          
        Scanner sc = new Scanner(System.in);
        int n = matrix.length, m = matrix[0].length;     //cells = n*m
        // here n tells the number of rows and m tells the length of 0th index row

        //input
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }  
        sc.close();  
    }  
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)