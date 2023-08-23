package permutation;

public class Permutation {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr2 = {2,1,5,6,3,4};

        if(permutation(arr,arr2)){
            System.out.println("they are permutation of each other");
        }
    }

    public static boolean permutation(int[] arr, int[] arr2){

        if(arr.length!=arr2.length){
            return false;
        }

        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;
        for (int i = 0; i < arr.length; i++) {

            sum1 +=arr[i];
            sum2 +=arr2[i];

            mul1 *=arr[i];

            mul2 *= arr2[i];
        }

        if(sum1==sum2 && mul1==mul2){
            return true;
        }

        return false;
    }
}
