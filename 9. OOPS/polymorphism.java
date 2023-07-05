//code for polymorphism
//polymorphism allow us to perform a single action in different ways
public class polymorphism {
    public static void main(String args[]){
        Calculator cal = new Calculator();
        System.out.println(cal.sum(2,3));
        System.out.println(cal.sum(2.5f,3.5f));
        System.out.println(cal.sum(2,3,5));

        Deer d = new Deer();
        d.eat();

        Animal a = new Animal();
        a.eat();
    }
}
//complile time polymorphism - (method overloading)
//multiple functions with same name but different parameters
class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
}
//rum time polymorphism - (method overriding)
//parent and child classes both contain the same function with a different defination
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)