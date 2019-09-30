public class ArrayD {
    public static void main(String[]args){
        int[][] grades = new int[][]{
                { 87, 93, 99, 75,60},
                { 93, 70, 98, 90, 75}
        };
        int total = 0;
        System.out.println(grades[0].length);

        System.out.println(grades.length);

        for (int i=0 ; i<grades.length; i++){
            for (int j = 0; j< grades[0].length;j++){
                total += grades[i][j];
                System.out.println(total);
            }
        }


    }
}
