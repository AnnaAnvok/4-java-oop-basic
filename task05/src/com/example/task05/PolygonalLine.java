package com.example.task05;

import java.util.*;


public class PolygonalLine {

    private List<Point> points = new ArrayList<Point>();



    public void setPoints(Point[] points) {
        this.points.clear();
        for (int i = 0; i < points.length; i++) {
            this.addPoint(points[i]);
        }
    }

    public void addPoint(Point point) {
        Point point1 = new Point(point.getX(), point.getY());
        this.points.add(point1);
    }

    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < this.points.size() - 1; i++) {
            length += this.points.get(i).getLength(this.points.get(i + 1));
        }
        return length;
    }

}
