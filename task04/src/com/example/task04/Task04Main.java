package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(11, 7), new Point(6, -9));
        System.out.println(line);
        System.out.println(line.isCollinearLine(new Point(4, 15)));
    }
}
