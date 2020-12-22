package com.company;

public class Main {
    public static void printIt() {
        System.out.println("JAVA");
        System.out.println("GEEKTECH");

    }

    public static void addition(int num1, int num2, String text){
        System.out.println(num1 + num2);    //addition- это код вложения
        System.out.println(text);
    }

    public static void multuply(float num1, float num2){
        System.out.println("Результат умножаения = "+ num1 * num2); // multiply - это код умножения
    }




    public static void main(String[] args) {
        printIt();
        printIt();
        printIt();
        test();
        addition(3, 5, "Hi");
        addition(102, 53, "Hello");
        addition( 12, 2,"MyMonky");
        multuply(2.5F, 4.5F);
        double r = subtruct(5, 1.5);
        System.out.println(r);

        //(6-3.2) * (4 - 1.2) + (8 - 5.2)
        System.out.println(subtruct(6, 2.3) * subtruct(4, 1.2) + subtruct(8, 5.2)); //3.7 * 2.8 + 2.8=
        System.out.println(concat("Hi", 7, "Friends"));
    }
    public static  String concat (String t1, int n, String t2){
        return t2 + " " + n + " " + t2;
    }

    public static double subtruct(int n1, double n2){
        double result = n1 - n2; //
        return result;

    }

    public static void test() {
        System.out.println("метод тест");
        int a = 9;
        System.out.println(a * 2);




    }
}

