package calculator;

/**
 * Calculator Класс для выполнения арефметических операций + - * /
 *
 * @author Odilsho Karamalishoev
 * @version 1.0
 * @since 02.11.2019
 */
public class Calculator {
    /**
     * Сложение
     *
     * @param first
     * @param second
     * @return результат
     */
    public static double add(double first, double second) {
        double result = first + second;
        System.out.println(first + "+" + second + " = " + result);
        return result;
    }
    public static void main(String[] args) {
        add(1, 1);
    }
}