
package singleDimensionArray;
import java.util.Arrays;
public class SingleDimensionArray {
    int[] arr;

    public SingleDimensionArray(int size) {
        arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) {

        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println(valueToBeInserted + " is inserted successfully");
            } else {
                System.out.println("Cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access the array");
        }
    }

    //Traverse the array
    public void traverse(){
        try{
            for (int j : arr) {
                System.out.print(j + " ");
            }
        }catch (Exception e){
            System.out.println("Array no longer exist");
        }
    }

    //Search in the array

    public void searchInArray(int searchValue){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==searchValue){
                System.out.println("Value: "+searchValue+" found at index: "+i);
                return;
            }
        }
        System.out.println(searchValue+ " is not found in the array.");
    }

    public void deleteValueByIndex(int valueToBeDeletedIndex){
        try{
            arr[valueToBeDeletedIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The value that is provided is not in the range of the array.");
        }
    }

    public void deleteValue(int deletedValue){
        try{
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==deletedValue){
                    arr[i] = Integer.MIN_VALUE;
                    return;
                }
            }
        }catch(Exception e){
            System.out.println("The value that is provided is not available in the array");
        }
    }
}
