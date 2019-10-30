package condition;

public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = 0; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }
}
