import java.util.Scanner;

public class AboutYou {

    String name;
    String School;
    int age;

    public AboutYou(String name, String School, int age){
        this.name = name;
        this.School = School;
        this.age = age;
    }
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("What is your name? ");
         String getName = input.nextLine();
        System.out.println("what is your school? ");
        String getSchool = input.nextLine();
        System.out.println("How old are you? ");
        int getAge = input.nextInt();
        AboutYou info = new AboutYou(getName, getSchool, getAge);

        info.greet();
    }

    public void greet(){
        System.out.println("My name is " + name.toUpperCase() + " and i attend " + School + " I am " + age + " years old. ");
        //My	name	is	Phil,	and	I	attend	Purdue	University.	I	am	36 years	old.


    }




}
