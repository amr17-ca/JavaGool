import java.util.Scanner;

public class RollDice {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("number of sides");
        int sides = input.nextInt() ;
        double ranNumber =  Math.random()   ;
        ranNumber = (ranNumber * sides) + 1;
        int randomInt = (int) ranNumber;
        System.out.println(randomInt);

    }
}
