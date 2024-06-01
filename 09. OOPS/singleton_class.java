class Singleton {

    //private constructor
    private Singleton () {

    }

    private static Singleton instance;   //static because, only once the instance is created


    //static because accessing by class name(ie, Singleton.getInstance())
    public static Singleton getInstance() {
        // check whether 1 obj only is created or not
        if (instance == null) {
            instance = new Singleton();
        }

        System.out.println("instance returned");
        return instance;
    }
}
public class singleton_class {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // all 3 ref variables are pointing to just one object
    }    
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)