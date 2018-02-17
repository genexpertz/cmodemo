package com.cdit.cmo;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("in calculator Main");
    }

    int a = 0, b = 0;

    public Calculator(){

    }

    public Calculator(int ax, int bx){
        a = ax;
        b = bx;
    }

    public int add(int a, int b){
        return a + b;
    }

    public int add(){
        return a + b;
    }

    public void hello1(){
        System.out.println("Hello1");
    }

}
