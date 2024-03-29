//simple code to demonstrate the static keyword
public class static_keyword {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.school = "St. Anthony";  //all the object will have this same name of school as it is static
        s1.setName("aditya");
        System.out.println(s1.getname());

        Student s2 = new Student();
        System.out.println(s2.school);

        Student s3 = new Student();
        s3.school = "Central Academy";   //name changed, will reflect on every object

        System.out.println(s2.school);
    }
}
class Student{
    String name;
    int roll_no;

    static String school;     //static variable

    static int returnPercentage(int maths, int chem, int phy){    //static method
        return (maths + chem + phy) / 3;
    }

    void setName(String name){
        this.name = name;
    }
    String getname(){
        return name;
    }
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)