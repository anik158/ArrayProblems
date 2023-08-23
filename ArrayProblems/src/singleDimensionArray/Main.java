package singleDimensionArray;

public class Main {
    public static void main(String[] args) {

        SingleDimensionArray sglArr = new SingleDimensionArray(10);
        sglArr.insert(0,10);
        sglArr.insert(3,11);
        sglArr.insert(7,21);
       // sglArr.insert(12,45);

        //System.out.println("Array traversal: ");
        //sglArr.traverse();
        sglArr.searchInArray(11);
        //sglArr.deleteValueByIndex(0);
        //System.out.println(sglArr.arr[0]);
        sglArr.deleteValue(10);
        System.out.println(sglArr.arr[0]);
    }
}
