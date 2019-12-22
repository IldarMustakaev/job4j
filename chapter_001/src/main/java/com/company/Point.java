package com.company;
//package java.lang.Math;
public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        return Math.sqrt(first + second);
    }

    public static void main(String[] args) {
        printDistance(0, 0, 2, 0);
        printDistance(5, 9, 3, 3);
        printDistance(2, 2, 4, 2);
        printDistance(34, 64, 78, 76);
    }

    public static void printDistance(int x1, int y1, int x2, int y2) {
        System.out.println(String.format("result (%d, %d) to (%d, %d) =%f", x1, y1, x2, y2, distance(x1, y1, x2, y2)));
    }
}
