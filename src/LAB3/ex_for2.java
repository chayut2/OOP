package LAB3;

import java.util.Scanner;

public class ex_for2 {
    public  static  void  main (String[] args){

        // รับค่าจำนวนเต็มจากผู้ใช้ 5 จำนวน
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) { //0-4
            System.out.print("enter integers: ");
            int num = sc.nextInt();
            total += num;
            System.out.println("entered : "+ num);
        }
        System.out.println("total: "+total);
        System.out.println("good bye.");




    }//main


}//class