package LAB8;

public class CompanyApp {

    public static void main(String[] args) {

        Employee emp1 = new Employee();

        emp1.setPid("1809700323928");
        emp1.setName("Chayut Saehan");
        emp1.setAge(22);
        emp1.setGender("Male");
        emp1.setTel("0936035452");

        emp1.setEmpID("emp001");
        emp1.setPosition("Programmer");
        emp1.setSalary(30000.00);

        System.out.println(emp1.toString());

    }
}
