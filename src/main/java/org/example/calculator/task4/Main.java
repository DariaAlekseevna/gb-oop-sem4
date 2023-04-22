package org.example.calculator.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        LRUCache<Employee> cache = new LRUCache<>(5);
        for (int i = 0; i < 10; i++) {
            Employee em = new Employee("Ivanov", 1234.0, "art"+i);
            cache.addEl(em);
        }
        System.out.println(cache.getAllEl());
    }
}
