package org.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        List<Double> listD = new ArrayList<>();
        List<Integer> listI = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listD.add((double) i);
            listI.add(i);
        }
        System.out.println(calc.sum(listD));
        System.out.println(calc.sum(listI));
    }
}
