package week4;

public class SwicthStatement {

    public static void main(String[] args) {

        String brand ="";
        brand = "Samsung";

        switch (brand){
            case "Apple":
                System.out.println("Do you want to buy Apple");
                break;
            case"Samsung":
                System.out.println("Do you want to buy Samsung");
                break;
            case"Huawei":
                System.out.println("Do you want to buy Huawei");
                break;
            default:
                System.out.println("Give a correct brand name");
        }



        }


    }




