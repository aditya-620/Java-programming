//chocola problem

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class chocola_problem {
    public static void main(String args[]){
        int n = 4, m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4};  //m-1
        Integer costHor[] = {4, 1, 2};  //n-1

        //sorting in descending order
        Arrays.sort(costVer, Collections.reverseOrder());   //{4, 3, 2, 1, 1};
        Arrays.sort(costHor, Collections.reverseOrder());   //{4, 2, 1};

        int h = 0, v = 0;     //horizontal and vertical cuts
        int hp = 1, vp = 1;  //horizontal and vertical piece
        int cost = 0;       //total cost

        while(h <costHor.length && v < costVer.length){
            if(costVer[v] <= costHor[h]){
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        while(h < costHor.length){
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        while(v < costVer.length){
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("min cost of cuts = " +cost);
    }
}
// Initial Value : Total_cost = 0
// Total_cost = Total_cost + (edge_cost * total_pieces)

// Cost 4 Horizontal cut Cost = 0 + 4*1 = 4
// Cost 4 Vertical cut Cost = 4 + 4*2 = 12
// Cost 3 Vertical cut Cost = 12 + 3*2 = 18
// Cost 2 Horizontal cut Cost = 18 + 2*3 = 24
// Cost 2 Vertical cut Cost = 24 + 2*3 = 30
// Cost 1 Horizontal cut Cost = 30 + 1*4 = 34
// Cost 1 Vertical cut Cost = 34 + 1*4 = 38
// Cost 1 Vertical cut Cost = 38 + 1*4 = 42

//For more info visit: https://www.spoj.com/problems/CHOCOLA/

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)