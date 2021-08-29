package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.abs.apply(-7);
        int b = calc.pow.apply(13);
        int c = calc.multiply.apply(7,8);
        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);

        a = calc.plus.apply(1, 2);
        b = calc.minus.apply(1,1);
        c = calc.devide.apply(a, b);
        // нельзя делить на 0, поэтому нужно либо отлавливать ошибку(try-catch)
        // либо делать проверку в devide и возвращать в этом случае 0, например..

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
    }
}
