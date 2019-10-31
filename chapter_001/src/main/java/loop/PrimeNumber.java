package loop;

public class PrimeNumber {

    public int calc(int finish) {

        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (i > 1) {
                boolean isPrime = true;
                for (int j = 2; j * 2 <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                }
            }
        }
        return count;
    }
}
