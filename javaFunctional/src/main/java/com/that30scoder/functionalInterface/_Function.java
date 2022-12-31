package com.that30scoder.functionalInterface;

import java.util.function.Function;

public interface _Function {

    static void main(String[] args) {
        int increment = incrementByOne.apply(1);
        //System.out.println(increment);
        int multiply = multiplyBy10.apply(increment);
        //System.out.println(multiply);

        Function<Integer,Integer>addMultiply = incrementByOne.andThen(multiplyBy10);
        System.out.println(addMultiply.apply(1));
    }

    Function<Integer, Integer> incrementByOne = number -> number +1;
    Function<Integer, Integer> multiplyBy10 = number -> number * 10;

}
