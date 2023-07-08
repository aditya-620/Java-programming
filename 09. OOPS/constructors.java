//types of constructors
public class constructors {
    public static void main(String args[]){
        Student s1 = new Student();   //object created
        Student s2 = new Student("aditya", 123);

        Student s3 = new Student();   
        s3.name = " shaurya";
        s3.roll_no = 456;
        s3.password = "qwerty";     
        s3.marks[0] = 100;
        s3.marks[1] = 80;
        s3.marks[2] = 90;

        Student s4 = new Student(s3);
        s4.password = "asdfg";
        s3.marks[2] = 100;

        for(int i=0; i<3; i++){
            System.out.println(s4.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll_no;
    String password;
    int marks[];

    //default constructor
    Student(){
        marks = new int[3];
        System.out.println("Default construction called...");
    }

    //parameterized constructor
    Student(String name, int roll_no){
        marks = new int[3];
        this.name = name;
        this.roll_no = roll_no;
    }

    //shallow copy constructor                  
    // Student(Student s3){                     
    //     marks = new int[3];
    //     this.name = s3.name;
    //     this.roll_no = s3.roll_no;
    //     this.marks = s3.marks;
    // }
    //o/p 100 80 100

    //deep copy constructor
    Student(Student s3){
        marks = new int[3];
        this.name = name;
        this.roll_no =  roll_no;
        for(int i = 0; i<marks.length; i++){
            this.marks[i] = s3.marks[i];
        }
    }
    //o/p 100 80 90
}

//If you like my code do give stars:-)
//Keep coding!!
//Thankyou;-)