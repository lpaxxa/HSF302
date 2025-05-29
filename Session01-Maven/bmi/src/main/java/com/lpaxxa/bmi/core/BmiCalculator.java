package com.lpaxxa.bmi.core;

public class BmiCalculator {
    public static double getBmi(double height, double weight) {
        return weight / (height * height);
    }//bmi = cân nặng (kg)/ chiều cao bình phương (m)
}
