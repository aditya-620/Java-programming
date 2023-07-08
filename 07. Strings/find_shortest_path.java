//To get the shortest path travelled in NORTH, SOUTH , EAST and WEST Directions
public class find_shortest_path {
    public static float getShortestPath(String path){
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);

            //south
            if(dir == 'S'){
                y--;
            }
            //north
            else if(dir == 'N'){
                y++;
            }
            //east
            else if(dir == 'E'){
                x++;
            }
            else{
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }   

    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println("shortest path: " +getShortestPath(path));
    }
}

//Time Complexity: O(n)

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)   