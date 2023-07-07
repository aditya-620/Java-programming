//simple code for super keyword
public class super_keyword {
    public static void main(String args[]){
        Horse h = new Horse();
        System.out.println(h.color);

    }
}
class Animal{
    String color = "red";
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        //super();
        super.color = "brown";   //this can update and also assign the value to parent class data(variables)
        System.out.println("Horse constructor is called");
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)