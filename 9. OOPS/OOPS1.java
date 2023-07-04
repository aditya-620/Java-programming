//simple classes and object code
public class OOPS1 {
    public static void main(String args[]){
        Pen p1 = new Pen();  //created a pen object called p1
        p1.setColor("red");
        System.out.println(p1.color);

        p1.setTip(8);
        System.out.println(p1.tip);

        // p1.setColor("yellow"); 
        p1.color = "yellow";
        System.out.println(p1.color);
    }    
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)