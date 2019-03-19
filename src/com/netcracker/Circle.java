package com.netcracker;

import java.util.Objects;

public class Circle {

    private float radius = (float) 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "com.netcracker.Circle[radius=" + radius + ",color=" + color + "]";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int hashCode() {
        int hashCode = 59;
        hashCode = 31 * hashCode + Float.floatToIntBits(radius);
        hashCode = 31 * hashCode + color.hashCode();
        return hashCode;
    }

    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null || !(object instanceof Circle) ) return false;
        Circle circle = (Circle) object;
        return this.radius == circle.radius &&
                Objects.equals(color, circle.color);
    }
}


