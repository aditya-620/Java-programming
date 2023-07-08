//simple code for interface
public class interface_code {
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("left, right, up, down, diagonal(in all 4 directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("left, right, up, down");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("left, right, up, down. diagonal - (by 1 steps)");
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)