package array;

public class Turn {
    public int[] back(int[] array) {
        for (int index = 0; index < array.length/2; index++) {

          int  temp = array[array.length-index-1];
            array[array.length-index-1] = array[index];
            array[index] = temp;
        }
        return array;
    }
}