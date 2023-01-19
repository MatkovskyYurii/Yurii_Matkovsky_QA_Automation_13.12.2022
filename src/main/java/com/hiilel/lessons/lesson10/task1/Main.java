package com.hiilel.lessons.lesson10.task1;

// class Box a,b,c + volume()
// class ColorBox sub -> Box + String color;
public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.a = 5;
        box.b = 3;
        box.c = 2;

        System.out.println(box.volume());

        ColorBox colorBox = new ColorBox();
        colorBox.a = 5;
        colorBox.b = 3;
        colorBox.c = 2;
        colorBox.color = "Red";

        System.out.println(colorBox.volume() + " " + colorBox.getColor());
    }
}
