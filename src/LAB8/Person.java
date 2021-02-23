package LAB8;

public class Person {
    //Class Attributes
    private String pid; //เลขบัตรประชาชน
    private String name;
    private int age;
    private String gender;
    private String tel;
    //constructors

    public Person() {
    }

    public Person(String pid, String name, int age, String gender, String tel) {
        this.pid = pid;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.tel = tel;
    }
    //getter and setter

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    //toString

    @Override
    public String toString() {
        return "Person{" +
                "pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public void introduce(){
        System.out.println("my name is +" + name);
        System.out.println("I am "+age+" year ole.");
    }
}