//this is an example of multilevel inheritance
public class inheritance {
    public static void main(String args[]){
        Dog dobby =  new Dog();
        dobby.eats();
        dobby.legs(4);
        dobby.bark();
    }
}
class Animal{
    String color;

    void eats(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammal extends Animal {
    int legs;
    void legs(int legs){
        this.legs = legs;
        System.out.println(legs);
    }
}
class Dog extends Mammal {
    void bark(){
        System.out.println("barks");
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)