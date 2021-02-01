package LAB5;

import java.util.Scanner;

public class Exercise_Lab5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        findValue(num);
    }
    private static void findValue(int num) {
        int count = 0;
        for (int i = num; i >=0 ; i--) {
            if (i%3==0 && i%5==0) {
                System.out.println(i + " ");
                count++;
            }
            if (count == 3) {
                break;
            }
        }
    }
}
