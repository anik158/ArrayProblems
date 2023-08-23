package twoDimensionalArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TwoDimensionalArray tda = new TwoDimensionalArray(3,3);

        tda.insert(0,0,13);
        tda.insert(0,1,34);
        tda.insert(1,2,45);
        tda.insert(2,2,79);
        tda.insert(2,0,61);
        //System.out.println(Arrays.deepToString(tda.arr));
        //tda.accessCell(0,2);
        //tda.searchingValue(34);
        tda.deleteValue(2,2);
        tda.traverseTwoDArray();
    }
}
