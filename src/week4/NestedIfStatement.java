package week4;

public class NestedIfStatement {
    public static void main(String[] args) {


        boolean isEmployee = true;

        boolean isStudent = true;
        boolean isOldStudent = true;
        boolean isAccountDep = true;
        boolean isSalesDep = true;

        if (isEmployee){

            if (isAccountDep){
                System.out.println("Account Office");
            }else if (isSalesDep){
                System.out.println("Sales Office");
            }
        }

        else if (isStudent) {
            if (isOldStudent){
                System.out.println("Classroom");

            }else {
                System.out.println("School");
            }
        }

    }
}
