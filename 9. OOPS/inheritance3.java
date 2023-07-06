//simple code for multiple inheritance
//java doesn't support multiple inheritance directly, but can be achieved by interface
public class inheritance3 {
    public static void main(String args[]){
        Cow c = new Cow();
        c.eats();
        Bear b = new Bear();
        b.eats();
    }
}

interface Herbivore {
    void eats();
}
interface Carnivore {
    void eats();
}
class Bear implements Herbivore, Carnivore{
    public void eats(){
        System.out.println("I am omnivore");
    }
}
class Cow implements Herbivore, Carnivore{
    public void eats(){
        System.out.println("I am Herbivore");
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)