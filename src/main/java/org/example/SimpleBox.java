package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
@NoArgsConstructor
@Data

public class SimpleBox {
    private Object object;

    public SimpleBox(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "SimpleBox{" +
                "object=" + object +
                '}';
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
