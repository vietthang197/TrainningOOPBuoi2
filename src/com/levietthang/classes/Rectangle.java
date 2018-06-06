package com.levietthang.classes;

public class Rectangle extends Shape {

    private float width, height;

    public Rectangle(float pivotX, float pivotY, String color, float width, float height) {
        super(pivotX, pivotY, color, KEY_RECTANGLE);
        this.width = width;
        this.height = height;
    }

    @Override
    public float area() {
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle : pivot( x:"+pivotX+", y: "+pivotY+"), color : "+color+", width : "+width+", height : "+height;
    }

    public boolean isRectangle(){
        if(width < height && width > 0 && height >0){
            return false;
        }
        return true;
    }
}
