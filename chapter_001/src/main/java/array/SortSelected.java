package array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length);
        int size = data.length;
        int index = FindLoop2.indexOf(data, min, 0, data.length);
        for (int i = 0; i < size; i++) {
               index=i;

            for (int j = i + 1; j < size; j++)
                if (data[j] < data[index]){
                    index = j;
                }
            int temp = data[index];
            data[index] = data[i];
            data[i] = temp;

        }
        return data;
    }


}

