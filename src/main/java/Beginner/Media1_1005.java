package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class Media1_1005 {



    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double peso1 = 3.5;
        double b = input.nextDouble();
        double peso2 = 7.5;
        double media = (a * peso1 + b * peso2)/11;

        //System.out.printf("MEDIA = %.5f", media); - BeeCrowd nao aceitaou esse formato
        System.out.println(String.format("MEDIA = %.5f" , media));
        input.close();

    }
        
}