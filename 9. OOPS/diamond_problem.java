// Java program to demonstrate How Diamond Problem
// Is Handled in case of Default Methods
public class diamond_problem {
    public static void main(String args[]){

		// Creating object of this class
		TestClass d = new TestClass();

		// Now calling the function defined in interface 1
		// from whom Interface 2and 3 are deriving
		d.show();
	}
}

// Interface 1
interface GPI {

	// Default method
	default void show(){
		System.out.println("Default GPI");
	}
}

// Interface 2
// Extending the above interface
interface PI1 extends GPI {
}

// Interface 3
// Extending the above interface
interface PI2 extends GPI {
}

// Implementation class code
class TestClass implements PI1, PI2 {

}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)