package week4;

public class Practice1 {

    public static void main(String[] args) {
// 2. A shop will give discount of 10% if the total amount is more than 1000. using if statement, print if you can get discount

        int amount=1230;

        if (amount>1000){
            System.out.println("You will have %10 discount and your new amount is: "+(amount-(amount*0.1)));
        }else{
            System.out.println("You don't have any discount");
        }
    }
}
