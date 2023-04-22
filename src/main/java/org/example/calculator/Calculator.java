package org.example.calculator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculator {
    public Double sum(List<? extends Number> list){
        Double sum =0.0;
        for (Number elem: list) {
            sum+= elem.doubleValue();
        }
        return sum;
    };

}
