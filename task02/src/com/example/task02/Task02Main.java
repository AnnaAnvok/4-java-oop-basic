package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(13, 45, 56);
        TimeSpan t2 = new TimeSpan(8, 28, 59);
        TimeSpan t3 = new TimeSpan(10, 54, 32);
        System.out.println("t1:" + t1.toString());
        System.out.println("t2: " + t2.toString());
        System.out.println("t3: " + t3.toString());
        t1.add(t2);
        System.out.println("Sum t1,t2: " + t1.toString());
        t3.subtract(t2);
        System.out.println("Sub t3,t2: " + t3.toString());
    }
}
