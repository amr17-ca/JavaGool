public class FindLongest {

    public static void main(String[]args){

        String[] names = {"abc","abcd","abcddd"};
        names[2] = "amralihassabo";
        int leng = names.length;
        String longest =  names[0];
        for (int i=1; i < leng ; i ++){
            if (names[i].length() > longest.length()){
                longest = names[i];
                System.out.println(longest);
            }

        }

    }


}
