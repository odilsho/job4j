package array;

public class Defragment {
    public static String[] compress(String[] array) {
        int j = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] != null) {
                String temp = array[j];
                 array[j] = array[index];
                array[index] = temp;
                j++;
            }


        }

        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}