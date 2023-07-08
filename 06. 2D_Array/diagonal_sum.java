//program to print the sum of primary and secondary diagonal sum
public class diagonal_sum {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;

        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         else if(i+j == matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        //Time Complexity: O(n^2)  [BRUTE FORCE]


        for(int i=0; i<matrix.length; i++){
            //for primary diagonal
            sum+=matrix[i][i];
            //for secondary diagonal
            if(i != matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        //Time Complexity: O(n)
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        System.out.println("sum of primary and secondary diagonals is: " +diagonalSum(matrix));
    }    
}


//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)

