package LAB7;

public class Student {
    //class attributes
    static String fuculty = "MT RUTS";
    String name;
    int age;
    String major;

    //constructor
    // default constructor
    public Student(){
        //....
    }

    //behavior
    public void introducs(){
        System.out.println("My name is "+name);
        System.out.println("I am "+age+" yeaes old");
        System.out.println("I studying in "+major);
        System.out.println("My faculty: "+fuculty);
    }
    public void changeFaculty(String newfac){
        fuculty = newfac;
    }
}
