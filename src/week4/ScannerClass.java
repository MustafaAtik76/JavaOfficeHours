package week4;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        String name = "Mike";
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name");
        String nameUser = input.next();
        System.out.println("nameUser = " + nameUser);

        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.println("age = " + age);



    }
}
