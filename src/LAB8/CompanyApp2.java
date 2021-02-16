package LAB8;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Employee do you have?:");
        int num = sc.nextInt();

        ArrayList <Employee> myEmp = new ArrayList<Employee>();

        for (int i = 0; i < num; i++) {
            //input data to object
            System.out.println("please, Enter Employee info"+(i+1)+":");
            Employee a = inputDataobject();
            myEmp.add(a);

        }

        //display data in ArrayList
        displayObject(myEmp);


    }//main
    private static void displayObject (ArrayList<Employee> myEmp){
        System.out.println("All objects in ArrayList: ");
        for (Employee a:myEmp){
            System.out.println(a.toString());
        }
    }


    private static Employee inputDataobject() {
        Scanner sc = new Scanner(System.in);

        Employee a = new Employee();
        System.out.println("Enter Employee Pid:");
        String id = sc.nextLine();
        a.setPid(id);

        System.out.println("Enter Employee Name:");
        a.setName(sc.nextLine());

        System.out.println("Enter Employee Age");
        a.setAge(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter Employee Gender");
        a.setGender(sc.nextLine());

        System.out.println("Enter Employee Tel:");
        a.setTel(sc.nextLine());

        System.out.println("Enter Employee EmpID:");
        a.setEmpID(sc.nextLine());

        System.out.println("Enter Employee Position:");
        a.setPosition(sc.nextLine());

        System.out.println("Enter Employee Salary:");
        a.setSalary(Double.parseDouble(sc.nextLine()));




        return a;
    }






}//class