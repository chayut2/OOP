package LAB5;

import java.util.Scanner;

public class ex_array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = new int[5];

        num = inputData(num);
        DisplayArray(num);

        int total = totalValue(num);
        System.out.print("Total is value is  : "+total);
        System.out.print("Average value in array : "+(total/num.length));
        fineMax(num);
        fineMin(num);





    }

    private static void fineMin(int[] num) {
        int min = num[0];
        for (int v:num) {
            if(min>v)
                min = v;
        }
        System.out.print("Minimum : "+min);

    }

    private static void fineMax(int[] num) {
        int max = num[0];
        for (int v:num) {
            if(max>v)
                max = v;
        }
        System.out.print("Maximum : "+max);

    }

    private static int totalValue(int[] num) {
        int total = 0;
        for (int v:num) {
            total += v;
        }
        return total;
    }

    private static void DisplayArray(int[] num) {
        System.out.println("Data in array : ");
        for (int v:num) {
            System.out.print(v+" ");

        }
    }

    private static int[] inputData(int[] num) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter Integer : ");
            num[i] = sc.nextInt();
        }
        return num;
    }
}
