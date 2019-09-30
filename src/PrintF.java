public class PrintF {
    public static void main(String [] args ){
        double d = 10.0 - 9.1;
        System.out.println(d);
        System.out.printf("%.2f", d);
        System.out.printf("\n");

        int a = 10;
        System.out.printf("Here is an int %d\n" , a);
        String t = "Hello";
        System.out.printf("Tis is a string: %s", t);

    }
}
