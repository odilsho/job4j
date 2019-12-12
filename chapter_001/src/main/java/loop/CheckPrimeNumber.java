package loop;

public class CheckPrimeNumber {
    public boolean check(int finish) {
        boolean prime = true;
        if (finish<2)
            prime=false;
        for (int i = 2; i < finish; i++) {
            if (finish % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

}