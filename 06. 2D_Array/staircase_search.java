public class staircase_search {
    public static boolean staircaseSearch(int matrix[][], int key){

        //METHOD-1
        // int row = 0, col = matrix[0].length-1;
        // while(row < matrix.length && col>=0){
        //     if(matrix[row][col] == key){
        //         System.out.println("key found at: ("+row +"," +col +")");
        //         return true;
        //     }
        //     else if (key < matrix[row][col]){
        //         col--;
        //     }
        //     else{
        //         row++;
        //     }
        // }
        // System.out.println("key not found!");
        // return false;

        //METHOD-2
        int row = matrix.length-1, col = 0;
        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col] == key){
                        System.out.println("key found at: ("+row +"," +col +")");
                        return true;
                    }
                    else if (key < matrix[row][col]){
                        row--;
                    }
                    else{
                        col++;
                    }
                }
                System.out.println("key not found!");
                return false;
        }
    

    public static void main(String args[]){
        int matrix[][] = {{10, 20, 30, 40},{15, 25, 35, 45},{27, 29, 37, 48},{32, 33, 39, 50}};
        int key = 33;
        staircaseSearch(matrix, key);
    }
}

//NOTE: Time Complexity = O(row + col)
/* If row>>>col then, T.C. = O(row)
   If col>>>row then, T.C. = O(col) */ 

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)