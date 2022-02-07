package Beginner;

import java.util.Scanner;

public class SimpleProduct_1004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = a * b;
        System.out.println("PROD = " + c);
        input.close();
    }

}
