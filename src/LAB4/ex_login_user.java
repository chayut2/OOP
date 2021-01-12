package LAB4;

import java.util.Scanner;

public class ex_login_user {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <10 ; i++) {
            System.out.println("Enter integer : ");
            int x = sc.nextInt();
            checkValue(x);
        }
}//main

private  static  void  checkValue(int x) {
        System.out.println(x%2==0?"Even":"Odd");
    }
}//class
