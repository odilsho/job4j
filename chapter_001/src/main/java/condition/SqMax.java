package condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = first;
        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = first;
                }
            } else result = third;
        } else if (second > third) {

            if (second > forth) result = first;

        } else if (third > forth) {
            result = second;
        }
        return result;
    }
}