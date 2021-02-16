package LAB7;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        //create objects
        Car c1 = new Car();

        Car c2 = new Car("AB123","Black","Honda");

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        c1 = inputDataObject(c1);
        System.out.println(c1.toString());

        //store object in ArrayList
        ArrayList<Car> myCar = new ArrayList<Car>();
        myCar.add(c1);
        myCar.add(c2);

        System.out.println(myCar.get(0));
    }

    private static Car inputDataObject(Car c1) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter car id: ");
        String id = sc.nextLine();
        c1.setId(id);

        System.out.println("Enter car color: ");
        c1.setColor(sc.nextLine());

        System.out.println("Enter car brand: " );
        c1.setBrand(sc.nextLine());

        return c1;
    }
}//class
