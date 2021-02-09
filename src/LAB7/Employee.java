package LAB7;

public class Employee {
    //attribute
    private String name;
    private int age;
    private String position;
    private double salary;
    //attribute

    //default constructor
    public Employee(){

    }

    //assign constructor
    public Employee(String name,int age ,String position , double salary){
        //assign data to class atrribute
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;

    }
    //display object data
    public void displayData(){
        System.out.println("Employee name : "+this.name);
        System.out.println("I'm  : "+this.age+" Years Old.");
        System.out.println("Position : "+this.position);
        System.out.println("Salary : "+this.salary);


    }
    //getter and setter methods getter=> read , setter=> update
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    //Age
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    //Position
    public String getPosition(){
        return this.position;
    }
    public void setPosition(String position){
        this.position = position;
    }

    //Salary
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }


}//class