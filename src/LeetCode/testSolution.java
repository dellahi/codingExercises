package LeetCode;

import java.util.*;

public class testSolution {

    public static void main(String args[]) throws Exception {

        /*Scanner in = new Scanner(System.in);

        System.out.println("Entrez un mot ou String : ");

        String chaineS = in.next();*/
        String[] word1 = new String[]{"ab", "c"};
        String[] word2 =new String[]{"a", "bc"};
        //boolean resultat = new MethodsClass().arrayStringsAreEqual(word1,word2);

        int[] subArray = Arrays.copyOfRange(new int[]{23,6,9},1,2);

        System.out.println(" the result : " + Arrays.toString(subArray));

    }
}