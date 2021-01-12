package login;

import java.util.Scanner;

public class lo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countWrong = 0;

        while (countWrong<3){
            System.out.println("Username : ");
            String usr = scanner.nextLine();

            System.out.println("password : ");
            String pwd = scanner.nextLine();
            if (usr.equals("admin") && pwd.equals("saiyai"))
            {
                System.out.println("Welcome to MT Website.");
                break;
            }
            else {
                System.out.println("username or password not correct.");
                countWrong++;
            }
            if (countWrong==3)
            {
                System.out.println("You account has been locked. Please, contect admin.");
            }
        }//while
    }
}