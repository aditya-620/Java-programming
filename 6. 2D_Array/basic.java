//some basic operation on 2d array
import java.util.*;
public class basic {

    //1. for searching an element in an 2d array
    public static boolean search(int matrix[][],int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at cell (" +i +"," +j +")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    //2. to find the largest and smallest number in 2d array
    public static void value(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]>largest){
                    largest = matrix[i][j];
                }
                if(matrix[i][j]<smallest){
                    smallest = matrix[i][j];
                }

            }
        }
        System.out.println("largest number is: " +largest);
        System.out.println("smallest number is: " +smallest);
    }

    //3. to print any row or column 
    public static void print(int matrix[][],int row,int col){
        for(int i = 0 ; i < matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
            System.out.print("row: "+matrix[row][j] +" ");
            }
            System.out.println();
            break;
        }
        System.out.println("column:");
        for(int i = 0 ; i < matrix.length; i++){
            System.out.println(matrix[i][col]);
            }
    }

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

        //operations
        search(matrix,5);
        value(matrix);

        System.out.println("enter the row you want to print");
        int row = sc.nextInt();
        System.out.println("enter the column you want to print");
        int col = sc.nextInt();
        print(matrix,row,col);
        sc.close();  
    }  
}


//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)