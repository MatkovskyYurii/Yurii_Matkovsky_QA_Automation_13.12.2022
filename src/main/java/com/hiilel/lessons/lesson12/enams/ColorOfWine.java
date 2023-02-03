package com.hiilel.lessons.lesson12.enams;

public enum ColorOfWine {
    //    Enum - список статичних об'єктів
//    BLUE, // це получається константа яку ми пишемо з великої літери якщо більше 1 слова тоді RED_COLOR_WINE etc...
    RED("Red"),
    WHITE("White"),
    ROSE("Rose");
    // RED("Red"),WHITE("White"),ROSE("Rose"); це перечислення статичних обєктів класу ColorOfWine
    String color;
//    Агрегація - це коли, об'єкт класу стає полем іншого класу

    ColorOfWine(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColorOfWine{" +
                "color='" + color + '\'' +
                '}';
    }
}
