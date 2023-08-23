package pairToSum;

import java.util.Arrays;

public class PairSum {

    public static void main(String[] args) {

        int[] arr = {2,7,18,2,13};

        int[] result = sumTwo(arr,20);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sumTwo(int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }
}
