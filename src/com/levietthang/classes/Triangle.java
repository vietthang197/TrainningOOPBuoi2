package com.levietthang.classes;

public class Triangle extends Shape{
    private float a, b, c;

    public Triangle(float pivotX, float pivotY, String color, float a, float b, float c) {
        super(pivotX, pivotY, color, KEY_TRIANGLE);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public float area() {
        float p = (a+ b+ c)/2;
        return (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String toString() {
        return "Triangle : pivot( x:"+pivotX+", y: "+pivotY+"), color : "+color+", a : "+a+", b : "+b+", c : "+c;
    }

    public boolean isTriangle(){
        if( a < 0 && b < 0 && c < 0 && a+b <= c && c+b <= a && a+c <= b) return false;
        return true;
    }
}
