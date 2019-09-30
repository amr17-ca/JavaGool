public class AboutMe {

    String name;
    String School;
    int age;

    public AboutMe(String name, String School, int age){
        this.name = name;
        this.School = School;
        this.age = age;
    }
    public static void main(String[] args){

        AboutMe name = new AboutMe("Amr","Purdue University", 30 );

        name.greet();
    }

    public void greet(){

        System.out.println("My name is " + name.toUpperCase() + " and i attend " + School + " I am " + age + " years old. ");


    }
}
