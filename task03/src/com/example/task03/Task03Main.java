package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber X = new ComplexNumber(3, 21);
        ComplexNumber Y = new ComplexNumber(2, -2);
        ComplexNumber AddRes = new ComplexNumber();
        ComplexNumber MultRes = new ComplexNumber();

        AddRes = X.Add(Y);
        MultRes = X.Mult(Y);

        System.out.println("AddRes: " + AddRes.Print());
        System.out.println("MultRes: " + MultRes.Print());

    }
}
