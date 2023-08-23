package maxProduct;

public class MaxProduct {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        System.out.println(maxProduct(arr));
    }

    public  static String maxProduct(int[] arr){
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]*arr[j]>maxProduct){
                    maxProduct = arr[i]*arr[j];
                    pairs = Integer.toString(arr[i])+","+Integer.toString(arr[j]);
                }
            }
        }

        return pairs;
    }
}


