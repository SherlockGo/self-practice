package com.lipeng.javase.lambda;

/**
 * @program: self-practice
 * @description: Lambda表达式基础
 * @author: LiPeng
 * @create: 2020-09-19 22:37
 **/
public class Java8Tester {

    public static void main(String[] args) {
        Java8Tester tester = new Java8Tester();

        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 × 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 ÷ 5 = " + tester.operate(10, 5, division));

        GreetingService service1 = message -> System.out.println("Hello " + message);
        GreetingService service2 = (message) -> System.out.println("Hello " + message);

        service1.sayMessage("Runoob");
        service2.sayMessage("Google");

    }

    interface MathOperation{
        int operation(int a, int b);
    }

    interface GreetingService{
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation operation){
         return operation.operation(a, b);
    }

}
