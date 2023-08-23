package twoDimensionalArray;

public class TwoDimensionalArray {
    int[][] arr;

    public TwoDimensionalArray(int rowSize, int colSize){
        arr = new int[rowSize][colSize];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }

    }

    public void insert(int row, int col, int valueToBeInserted){
        try{

            if(arr[row][col]==Integer.MIN_VALUE){
                arr[row][col] = valueToBeInserted;
                System.out.println(valueToBeInserted+" is inserted successfully.");
            }else{
                System.out.println("The cell is occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index for 2D array.");
        }
    }

    public void accessCell(int row, int col){
        System.out.println("\nAccessing Row#"+row+", Col#"+col);
        try{
            System.out.println("Cell value is: "+arr[row][col]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index is not available ine array.");
        }
    }

    public void traverseTwoDArray(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void searchingValue(int value){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==value){
                    System.out.println(value+" value is found at index: "+i+j);
                    return;
                }
            }
        }
        System.out.println("Value is not found");
    }

    public void deleteValue(int row, int col){
        try{
            System.out.println("Successfully Deleted: "+arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index is out of range of the array");
        }
    }
}
