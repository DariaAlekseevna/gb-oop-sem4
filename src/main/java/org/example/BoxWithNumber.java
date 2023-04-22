package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
@NoArgsConstructor
public class BoxWithNumber<T extends Number> {
    private T[] array;

    public double average() {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result+=array[i].doubleValue();
        }
        result /= array.length;
        return result;
    }

    public BoxWithNumber(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public boolean compare(BoxWithNumber<?> boxWithNumber) {
        return Math.abs(average()-boxWithNumber.average())<0.000001;
        //просто аверадже применяется к текущему классу (у нас это бокс с дабл)
        // везде Т заменилась на дабл тип, потому что вызываем от дабл типа, а потом передаем инт и возникает ошибка
        // вместо Т ставим ?(самый общий тип, тип берется не на момент инициализации а по факту)
    }
}
