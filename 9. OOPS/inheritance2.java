//example of hybrid inheritance
public class inheritance2 {
    public static void main(String args[]){
       human h1 = new human();
       h1.eats();
       h1.talk();
       
       shark s1 = new shark();
       s1.breathe();
       s1.speed();
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


class Fish extends Animal {
    void swim(){
        System.out.println("swin");
    }
    
}
class tuna extends Fish{
    void wings(){
        System.out.println("four wings");
    }
}
class shark extends Fish{
    void speed(){
        System.out.println("fast");
    }
}


class Bird extends Animal {
    
}
class peacock extends Bird{

}


class Mammal extends Animal {
    int legs;
}
class dog extends Mammal{
    void bark(){
        System.out.println("barks");
    }
}
class cat extends Mammal{
    void meow(){
        System.out.println("meow");
    }
}
class human extends Mammal{
    void talk(){
        System.out.println("talks");
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)