package week4;

import java.util.Scanner;
import java.lang.String;

public class ScanPractice {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your browser name");
        String browserName = scan.nextLine();

        switch (browserName) {


            case "Chrome":
                System.out.println(browserName + " is getting ready");
                break;
            case "FireFox":
                System.out.println(browserName + " is getting ready");
                break;
            case "Safari":
                System.out.println(browserName + " is getting ready");
                break;

            default:
                System.out.println("Invalid browser name");

        }
    }
}
