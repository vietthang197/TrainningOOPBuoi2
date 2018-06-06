package com.levietthang.classes;

public abstract class Shape {
    protected float pivotX;
    protected float pivotY;
    protected String color;
    protected int type;

    public static final int KEY_CIRCLE = 1;
    public static final int KEY_RECTANGLE = 2;
    public static final int KEY_TRIANGLE = 3;


    public Shape(float pivotX, float pivotY, String color, int type) {
        this.pivotX = pivotX;
        this.pivotY = pivotY;
        this.color = color;
        this.type = type;
    }

    public float getPivotX() {
        return pivotX;
    }

    public void setPivotX(float pivotX) {
        this.pivotX = pivotX;
    }

    public float getPivotY() {
        return pivotY;
    }

    public void setPivotY(float pivotY) {
        this.pivotY = pivotY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public abstract float area();
}
