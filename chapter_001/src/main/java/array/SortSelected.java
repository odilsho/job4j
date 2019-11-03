package array;


public class SortSelected {

    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length-1);
        int index = FindLoop2.indexOf(data, min, 0, data.length-1);
        for (int i = 0; i < data.length-1; i++)
        {
            // Find the minimum element in unsorted array
           index = i;
            for (int j = i+1; j <data.length-1; j++)
                if (data[j] < data[index])
                    index = j;

            // Swap the found minimum element with the first
            // element
            int temp = data[index];
            data[index] = data[i];
            data[i] = temp;
        }

        return data;
    }

}