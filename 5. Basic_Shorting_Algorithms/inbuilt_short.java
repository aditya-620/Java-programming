//INBULIT SHORTING IN JAVA

import java.util.*;  
/***
 import java.util.Arrays;      (for ascending order shorting)
 import java.util.Collections;   (for decending order shorting)
 */
public class inbuilt_short {
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void printarr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //MAIN BLOCK
    public static void main(String argsa[]){
        int arr[] = {5,4,3,1,2};

        //ascending order sorting...
        System.out.println("original array: ");
        printarr(arr);

        System.out.println("sorted array: ");
        Arrays.sort(arr);
        printarr(arr);

        int arr1[] = {5,4,3,1,2}; 
        System.out.println("sorted array with index(2,5): ");
        Arrays.sort(arr1,2,5);
        printarr(arr1);

System.out.println("........................................................................................");

        //decending order sorting...
        Integer arr2[] = {5,4,3,1,2};     //reverse sort require object datatype variable 

        //ascending order sorting...
        System.out.println("original array: ");
        printarr(arr2);

        System.out.println("sorted array: ");
        Arrays.sort(arr2,Collections.reverseOrder());
        printarr(arr2);

        Integer arr3[] = {5,4,3,1,2}; 
        System.out.println("sorted array with index(0,2): ");
        Arrays.sort(arr3,0,2,Collections.reverseOrder());
        printarr(arr3);
    }
}

//NOTE: Time Complexity = O(n logn)   {which is better than O(N^2)}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)