package com.hiilel.lessons.lesson12.shop;

import com.hiilel.lessons.lesson12.abstraction.BottleProduct;

public class Whiskey extends BottleProduct {

    private int years;
    private String type;
    // імплементація конструктора якщо ми створили його в super класі bottle і немає конструктора без параметрів
    public Whiskey(int volume, String design, String manufacturer, double grade, int years, String type) {
        super(volume, design, manufacturer, grade); // Силка на конструктор super Bottle
        this.years = years;
        this.type = type;
    }

//       public Whiskey(int volume, String design, String manufacturer, double grade) {
//        super(volume, design, manufacturer, grade);
//    } // імплементація конструктора якщо ми створили його в super класі bottle і немає конструктора без параметрів
//  void метод який нічого не повертає

    public void calculateGrade() {
        double grade = getGrade(); // тут ми використали get щоб отримати значення grade
        for (int i = 0; i < years; i++) {
            grade += 1;
        }
        setGrade(grade); // тут ми використали set для того щоб встановите нове значення яке ми рахуємо через метод
    }
//  Клас OBJECT являється Батьком-Super класмо всіх методів які використовують посилання (String, etc) навіть нашого
//  класу Bottle
    @Override
//    protected Object getDescription() { // protected - модифікатор доступа , Object - тип значення яке повертаєсться ,
//        //getDescription()- сигнатура метода (сигнатура метода це назва і все що в дужках)
//        return null; // { return null; } - це реалізація(поведінка)
//    }
    public String getDescription() {
        return "Whiskey: " + getDesign() +" ,with type: " + type;
    }
    // Перегрузка/Перевантаження - ми змінюємо тільки сигнатуру (може бути багато разів)
    // тобто наші параметри (внаслідок чого змінюється реалізація також)
    // Переопредиление міняється все крім сигнатури(параметри) (тільки 1 раз)
    // 1. Модифікатор доступу (protected -> public etc)
    // 2. Може змінюватись тип значення яке повертаємо Object -> String він звужується йде вниз (cast)
    // 3. Може змінюватись поведінка
}
