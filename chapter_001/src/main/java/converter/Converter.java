package converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static double rubleToDollar(double value) {
        return value/60;
    }
    public static int dollarToRuble(int value) {
        return value*60;
    }
    public static int euroToRuble(int value) {
        return value*70;
    }

    public static void main(String[] args) {

        int euro = rubleToEuro(140);
        double dollar=rubleToDollar(140.0);
        int dollToRub=dollarToRuble(2);
        int euroToRub=euroToRuble(2);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar");
        System.out.println("2 dollars are " + dollToRub + " rubles");
        System.out.println("2 euros are " + euroToRub + " rubles");
    }


}
