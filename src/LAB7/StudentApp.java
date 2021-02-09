package LAB7;

public class StudentApp {
    public static void main(String[] args) {
        //create object of student class
        Student std1 = new Student();//==> call constructor

        std1.introducs();

        std1.name = "Puriwat Lertkrai";
        std1.age = 34;
        std1.major = "MIT";

        std1.introducs();

        Student std2 = new Student();
        std2.name = "piyapong Senanut";
        std2.age = 37;
        std2.major = "AC";
        std2.introducs();

        std2.major = "MIT";
        std2.introducs();

        std1.changeFaculty("Engineer RUTS");

        std1.introducs();
        std2.introducs();

    }
}
