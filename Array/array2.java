//simple array updation program
public class array2 {
    public static void updated(int marks[]){
        for(int i=0; i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[]={97,98,99};
        updated(marks);

        //print the updated marks
        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)