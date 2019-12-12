package array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min = 0, index = 0;
        int size = data.length;
        for (int i = 0; i < size; i++) {
            min = MinDiapason.findMin(data, i, data.length);
            index = FindLoop2.indexOf(data, min, i, data.length);
            int temp = data[index];
            data[index] = data[i];
            data[i] = temp;
        }
        return data;
    }


}

