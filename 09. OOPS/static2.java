public class static2 {
    public static void main(String args[]){
        Human aditya = new Human("Aditya", 19, 15000, false);
        Human shaurya = new Human("Shaurya", 14, 10000, false);
        System.out.println(Human.population);
        fun();
        // fun2();
        // greetings();

        static2 funn = new static2();
        funn.fun2();
        
    }
    //this function does not depend on object
    static void fun(){
        //greetings(); // error: non-static method greetings() cannot be referenced from a static context
        //we cannot use this as it requires an instance  but the function you are using  it in does not depend on instance(as static)

        //you cannot access non-static stuff  without refrencing  their instance in a static context

        //hence, here I am refrencing it
        static2 obj = new static2();
        obj.greetings();
    }

    //this function depend on object
    void greetings(){
        System.out.println("hello world");
    }

    void fun2(){
        greetings();
    }


}
class Human{
    String name;
    int age;
    int salary;
    boolean married;
    static long population;

    public Human(String name, int age, int salary, boolean married){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}

//static variables are independent of objects
//the static variable or method belong to the class not the object