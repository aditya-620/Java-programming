//activity selection problem
import java.util.*;
public class activity_selection {
    public static void main(String args[]){
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        //end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity
        max.Act = 1;
        and.add(0);

        int lastEnd = end[0];
        for(int i=0; i<end.length; i++){
            if(start[i] >= lastEnd) {
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("max activities: " +maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.println("A" +ans.get(i));
        }
    }
}

//refer this for more info: https://www.geeksforgeeks.org/activity-selection-problem-greedy-algo-1/

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)