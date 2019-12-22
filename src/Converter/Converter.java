package Converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int rubleToDollar(int value) {
        return value/60;
    }

    public static void main(String[] args) {
        System.out.println("140 rubles are 2. Test result : " + (2.0 == rubleToEuro(140)));
        System.out.println("120 rubles are 2. Test result : " + (2.0 == rubleToDollar(120)));
        System.out.println("5 euro are 350. Test result : " + (350.0 == euroToRuble(5)));
        System.out.println("9 dollars are 540. Test result : " + (540.0 == dollarToRuble(9)));
    }
}
