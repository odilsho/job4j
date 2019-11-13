package array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        boolean etalon = data[0];
        for (int i = 0; i < data.length / 2; i++) {
            if (etalon == data[i + 1])
                result = true;
            else result = false;
        }
        return result;
    }
}