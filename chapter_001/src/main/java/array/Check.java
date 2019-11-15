package array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        boolean etalon = data[0];
        for (int i = 0; i < data.length ; i++) {
            if (etalon != data[i + 1])
                result = false;
                break;
        }
        return result;
    }
}