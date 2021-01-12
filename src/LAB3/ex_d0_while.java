package LAB3;

import java.util.Scanner;

public class ex_d0_while {

    public static void main(String[] args) {

        //

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print(("Enter integers:"));
            num = sc.nextInt();
        }while (num!=0);

        System.out.println("Good Bye.");
    }
}