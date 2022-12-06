package week5;

public class StringPractice {

    public static void main(String[] args) {

        String s1 = "hat";
        String s2= new String("hat");
        String s3 = "hat";

        System.out.println(s1.equals(s2));

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);


        s3 = "bag";  // Assigment

        System.out.println(s3);

        checkLength();
    }


        public static void checkLength (){

                System.out.println("house".length());
                System.out.println("How much is the length of this **** statement?".length());

                trimMethod();
    }


    public static void trimMethod (){

        System.out.println("   This is a   .trim methode, practice .  ".trim());

        System.out.println("   This is a   .trim methode, practice .  ".replace(" ", ""));


        System.out.println("----------------------------------");
        indexMethod();
    }

    public static void indexMethod (){

        String data = "Hello, World";

        System.out.println(data.indexOf('o'));
        System.out.println(data.lastIndexOf("o"));
substringMethod();
    }

    public static void substringMethod (){

        System.out.println("----------------------------------------------");
        String data = "This is substring practice";

        String subData1 = data.substring(5);
        String subData2 = data.substring(5,10);

        System.out.println(subData1);
        System.out.println(subData2);
        System.out.println(data.repeat(3));

        System.out.println("------------------------------------------");

        isEmptyBlank();
    }

    public static void isEmptyBlank() {

        String data = "";
        String data1= "  ";

        System.out.println(data.isEmpty());
        System.out.println(data1.isEmpty());

        System.out.println(data.isBlank());
        System.out.println(data1.isBlank());

        System.out.println("------------------------------");
        equalsMethod();
    }

    public static void equalsMethod() {

        String DATA = "PRACTICE";
        String data = "practice";

        System.out.println(DATA.equals(data));

        System.out.println(DATA.equalsIgnoreCase(data));

        containsMethod();
    }


    public static void containsMethod(){

        System.out.println("Umbrella".contains("e"));
        System.out.println("Umbrella".contains("Umb"));
        System.out.println("Umbrella".contains("umb"));

        startsOrEnds();
    }

    public static void startsOrEnds(){

        String data = "abcdefgh";

        System.out.println("data.startsWith(\"abc\") = " + data.startsWith("abc"));
        System.out.println("data.startsWith(\"A\") = " + data.startsWith("A"));
        System.out.println("data.endWith(\"h\") = " + data.endsWith("h"));
        System.out.println("data.endWith(\"H\") = " + data.endsWith("H"));

nameGenerator();
    }

    public static void nameGenerator (){

        String firstName = "Robert";
        String secondName = "Down";
        String lastName = "Junior";

        String name = "Robert Down Junior";

        System.out.println(firstName.substring(0,1)+"."+ secondName.substring(0,1)+ "."+lastName);

        System.out.println(name.substring(0,1)+"."+name.substring(7,8)+ "."+ name.substring(12));
    }

}
