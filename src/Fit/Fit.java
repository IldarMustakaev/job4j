package Fit;

public class Fit {

    public static double manWeight(double height) {
        return (height - 100)*1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110)*1.15;
    }

    public static void main(String[] args) {
        System.out.println("Man 180 is " + manWeight(180));
        System.out.println("Woman 170 is " + womanWeight(170));
    }
}