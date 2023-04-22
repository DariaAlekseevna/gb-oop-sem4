package org.example.calculator.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String fio;
    private Double salary;
    private String jobTitle;

    public Employee(String fio, Double salary, String jobTitle) {
        this.fio = fio;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
