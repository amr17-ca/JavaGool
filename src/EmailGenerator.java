import java.util.Scanner;
public class EmailGenerator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("first name");
        String first = input.nextLine();
        Scanner input2 = new Scanner(System.in);
        System.out.println("last name");
        String last = input2.nextLine();

        System.out.println(userName(first,last));

        Scanner input3 = new Scanner(System.in);
        System.out.println("give me the user name to generate an email ");
        String firstPart = input.nextLine();
        Scanner input4 = new Scanner(System.in);
        System.out.println("email provider for example: gmail.com , outlook.com : ");
        String secondPart = input2.nextLine();
        System.out.println(makeEmail(firstPart,secondPart));





    }

    public static String userName(String firstName, String lastName ){
        String nickName = firstName.charAt(0) + lastName;
        nickName.toLowerCase();
        return nickName;
    }

    public static String makeEmail(String name, String provider){
        String email = name + "@" + provider;
        return email;

    }

}
