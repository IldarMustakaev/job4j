package com.company;

public class SqArea {
    public static double square(int p, int k) {
        double height =  p / (2 * k + 2);
        double length = height * k;
        return height * length;
    }

    public static void main(String[] args) {
        System.out.println(" p = 4, k = 1, s = 1, real = " + square(4,1));
        System.out.println(" p = 6, k = 2, s = 2, real = " + square(6,2));
    }
}