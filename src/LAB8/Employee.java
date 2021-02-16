package LAB8;

public class Employee extends Person {
    //Class Attributes
    private String empID; //รหัสพนักงาน
    private String position;
    private double salary;
    //constructors


    public Employee() {
    }

    public Employee(String pid, String name, int age, String gender, String tel, String empID, String position, double salary) {
        super(pid, name, age, gender, tel);
        this.empID = empID;
        this.position = position;
        this.salary = salary;
    }
    //getter and setter

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //toString

    @Override
    public String toString() {
        return "Employee{" +
                "empID='" + empID + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }
}