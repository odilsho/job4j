package array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int i = 1; i < bound+1; i++) {
            rst[i-1] = (int)(Math.pow(i,2));
        }
        return rst;
    }
}