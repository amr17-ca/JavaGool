import java.util.Scanner;

public class RollDiceN {
    int sides;
    RollDiceN(int sides ){

        this.sides=sides;
    }



    public void roll(){
        double ranNumber =  Math.random()   ;
        ranNumber = (ranNumber * sides) + 1;
        int randomInt = (int) ranNumber;
        System.out.println(randomInt);
    }

}
