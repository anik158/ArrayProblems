package reverseArray;

import java.sql.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] customArray = {1,2,3,4,5};

        reverseArray(customArray);
    }

    private static void reverseArray(int[] customArray) {

         for (int i=0; i < customArray.length/2; i++) {
             int other = customArray.length-i-1;
            int temp = customArray[i];
            customArray[i] = customArray[other];
            customArray[other] = temp;
        }

        System.out.println(Arrays.toString(customArray));
    }


}
