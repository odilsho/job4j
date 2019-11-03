package loop;
    public class CheckPrimeNumber {
        public boolean check(int finish) {
            boolean prime = false;
            for (int i = 2; i < finish; i++) {
                if (finish%2!=0)
                    prime=true;
                else
                    prime=false;
            }
            return prime;
        }

    }