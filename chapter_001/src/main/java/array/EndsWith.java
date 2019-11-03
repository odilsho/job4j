package array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        // проверить. что массив word имеет последние элементы одинаковые с post
        for (int i = 0; i <= word.length - 1; i++) {
            for (int j = 0; j <= post.length - 1; j++) {
                if (word[i] == post[j])
                    result = true;
                else
                    result = false;
            }
        }

        return result;
    }
}