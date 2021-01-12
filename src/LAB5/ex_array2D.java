package LAB5;

import java.util.Scanner;

public class ex_array2D {
    public static void main(String[] args) {
        int num[][] = new int[2][3];

        num = InputData(num);
        DisplayArray(num);
    }

    private static void DisplayArray(int[][] num) {
        System.out.print("Data in array : ");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] InputData(int[][] num) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {//row
            for (int j = 0; j < num[i].length; j++) {//col
                System.out.print("Enter Integers : ");
                num[i][j] = sc.nextInt();
            }//col
        }//row
        return num;
    }
}
