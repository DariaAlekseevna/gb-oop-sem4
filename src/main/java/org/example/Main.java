package org.example;

public class Main {
    public static void main(String[] args) {
        SimpleBox simpleBox1 = new SimpleBox(200);
        System.out.println(simpleBox1);

        SimpleBox simpleBox2 = new SimpleBox("Meow");
        System.out.println(simpleBox2);

        SimpleBox simpleBox3 = new SimpleBox(100);
        System.out.println(simpleBox3);

        // нужно обернуть в инт, так как обджект принимает любой тип, а у нас сумма может быть только инт
        // класс симпл бокс нельзя привести к инт, можно привести значение, поэтому делаем гет обджект
        Integer sum = (Integer) simpleBox1.getObject() + (Integer) simpleBox3.getObject();
        // когда используем обджект, нужно самостоятельно приводить к нужному типу

        System.out.println("Sum = " + sum);

        simpleBox3.setObject("paaaaw");
        // чтобы избежать ошибки самое простое посмотреть на принадлежность к классу

        if (simpleBox3.getObject() instanceof Integer && simpleBox1.getObject() instanceof Integer) {
            sum = (Integer) simpleBox1.getObject() + (Integer) simpleBox3.getObject();
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("not correct type of data");
        }

        // минусы использования обджекта, нет защиты,
        // что кто-то может нам сломать код, если введет тип, который мы не учли/забыли учесть
        // так как обджект принимает любые значения,
        // то нужны проверки на все возможные типы и забыть что-то учесть не трудно
        // нужно кастить самим в определенный тип, который нам нужен - не оч удобно
        // чем больше элементов, тем больше проверок(ифов)

        GenBox<Integer> genBox = new GenBox<>(10);
        GenBox<Integer> genBox1 = new GenBox<>(20);
//        genBox.setObject("meow");  уже не получится, так как принимает только интекджер
        Integer sum1 = genBox.getObj() + genBox1.getObj();
        System.out.println("sum1 = " + sum1);

        Integer[] arrayInt = {10, 15, 15, 4};
        Double[] arrayDouble = {10.10, 15.15, 15.15, 4.04};
        Double[] arrayDouble1 = {10.0, 15.0, 15.15, 4.04};

        BoxWithNumber<Integer> boxInt = new BoxWithNumber<>(arrayInt);
        BoxWithNumber<Double> boxDouble = new BoxWithNumber<>(arrayDouble);
        BoxWithNumber<Double> boxDouble1 = new BoxWithNumber<>(arrayDouble1);

        System.out.println("Average double numbers: " + boxDouble.average());
        System.out.println("Average double1 numbers: " + boxDouble1.average());
        System.out.println("Average int numbers: " + boxInt.average());

        System.out.println(boxDouble.compare(boxDouble));
        System.out.println(boxDouble.compare(boxDouble1));
        System.out.println(boxDouble.compare(boxInt));

    }
}