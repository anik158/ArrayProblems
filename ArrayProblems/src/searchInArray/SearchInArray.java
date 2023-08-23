package searchInArray;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr= {25,34,56,91};

        int result = search(arr,34);
        System.out.println(result);
    }

    public static int search(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                return arr[i];
            }
        }
        throw new IllegalArgumentException("No value found");
    }
}
