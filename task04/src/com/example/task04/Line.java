package com.example.task04;

public class Line {
    private Point A;
    private Point B;

    public Line(Point p1, Point p2) {
        A = p1;
        B = p2;
    }

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public String toString() {
        return String.format("(%s;%s)", A.toString(), B.toString());
    }

    public boolean isCollinearLine(Point p) {
        int X = A.y - B.y;
        int Y = B.x - A.x;
        int Z = A.x * B.y - B.x * A.y;
        return (X * p.x + Y * p.y + Z == 0);
    }
}