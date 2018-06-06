package com.levietthang.classes;

public class Circle extends Shape{
    private float radius;

    public Circle(float pivotX, float pivotY, String color, float radius) {
        super(pivotX, pivotY, color, KEY_CIRCLE);
        this.radius = radius;
    }

    @Override
    public float area() {
        return (float) Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle : pivot( x:"+pivotX+", y: "+pivotY+"), color : "+color+", radius : "+radius;
    }
}
