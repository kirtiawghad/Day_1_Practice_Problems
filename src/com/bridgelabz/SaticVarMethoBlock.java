package com.bridgelabz;

public class SaticVarMethoBlock {
    static int a =13;
    static int b = 27;

    static int sum =0;

    public static void main(String[] args) {

        System.out.println(sum());
    }
     public static int sum(){
        sum = a+b;
        return sum;
    }
}
