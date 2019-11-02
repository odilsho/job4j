package loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double rem = 1;
        double debt = 0;
        double per = percent / 100;
        debt = amount * per + amount;

        if (salary > debt)
            rem = salary - debt;
        else
            rem = debt - salary;
        while (rem > 0) {

            rem = rem * per + rem - salary;
            ++year;
        }
        return year;
    }
}