//Trapped rain water problem (Samsung interwiew qs)
public class trapped_rainwater {
    public static int trapped_rain_water(int height[]){
        int n = height.length;
        //calculate left max boundary - auxiliary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate right max boundary - auxiliary array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedwater = 0;
        //loop
        for(int i=0; i<n; i++){
            //waterLevel = min(leftMax boundary, rightMax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trapped water = waterLevel - height[i]
            trappedwater += waterLevel - height[i];
        }
        return trappedwater;
    }

    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Total water trapped: " +trapped_rain_water(height));
    }
}

//Time complexity: O(n)
//for more info visit: https://www.geeksforgeeks.org/trapping-rain-water/

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)