import java.util.Scanner;

public class Associative {
    public  int x ;
    public int y;
    public int z ;
    // constructor
    public Associative(int x, int y, int z){
        this.x = x;
        this.z = z;
        this.y = y;
    }

    public int firstTwo(){
        int first = ( x + y ) * z;
        return first;

    }

    public int lastTwo(){
        int second = x + (y*z);
        return second;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

     Associative asc = new Associative(a,b,c);
        System.out.println(asc.firstTwo());
        System.out.println(asc.lastTwo());
    }
}
