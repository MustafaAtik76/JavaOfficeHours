package week4;

public class Practice3 {

    public static void main(String[] args) {
        int orderNumber = 4;

        switch (orderNumber) {


            case 1:
                System.out.println("Order number 1 is ready");
                break;
            case 2:
                System.out.println("Order number 2 is ready");
                break;
            case 3:
                System.out.println("Order number 3 is ready");
                break;
            case 4:
                System.out.println("Your order is ready");
                break;
            default:
                System.out.println("Please wait for your order");
        }
    }
}

