package loop;
    public class CheckPrimeNumber {
        public boolean check(int finish) {
            boolean prime = false;
            for (int i = 0; i < finish; i++) {
                if (i%2==0)
                    prime=true;
                else
                    prime=false;
            }
            return prime;
        }

    }