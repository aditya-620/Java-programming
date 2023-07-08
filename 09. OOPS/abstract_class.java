//basic abstract class & method code
public class abstract_class {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eats();
        h.walk();
        System.out.println(h.color);   //default color will be print(brown)- which is defined in abstract class

        Chicken c = new Chicken();
        c.eats();
        c.walk();
        h.colorChange();   //color change 
        System.out.println(h.color);  
    }
}
//Object of abstract class is never created, but due to inheritance the constructor is called
abstract class Animal{
    String color;
    
    Animal(){
        color = "brown";     //constructor 
    }
    void eats(){
        System.out.println("animal eats");
    }
    abstract void walk();     //abstrct method 
}
class Horse extends Animal{
    void colorChange(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    void colorChange(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}


//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)