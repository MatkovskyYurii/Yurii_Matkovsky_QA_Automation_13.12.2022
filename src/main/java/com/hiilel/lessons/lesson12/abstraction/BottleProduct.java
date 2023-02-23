package com.hiilel.lessons.lesson12.abstraction;

public abstract class BottleProduct {
    // Інкапсуляція - це приховання реалізації, приклад автомобіль в якому ми не знаємо як працює двигун корбка
    // та тормоз,але ми знаємо як ними користуватись. інкапсуляцію виконують через модифікатори доступу (public,
    // private etc..)
        // ПРИКЛАДИ ІНКАПСУЛЯЦІЇ
//    protected int volume; // доступ в класі bottle і всіх класах які наслідують bottle
//    int volume; // тут одразу стоїть default він достпуний тільки в рамках одного пакету! і навіть якщо
//    створити пакет в цьому ж пакеті він буде не доступний всерівно в цьому пакеті
//    private int volume; // тільки в рамках одного класу в якому він знаходиться

    private int volume; // прості типи данних живуть в стеці і пишуться з малої літери
    private String design; // силочні типи данних пишуться з ВЕЛИКОЇ літери
    private String manufacturer; // це також називають поля
    private double grade;

// ПОЛІМОРФІЗМ - ОДИН МЕТОД РІЗНІ РЕАЛІЗАЦІЇ (РІЗНА ПОВЕДІНКА) ВІН РЕАЛІЗУЄТЬСЯ ЧЕРЕЗ ПЕРЕОПРЕДИЛЕНИЕ


    public BottleProduct(int volume, String design, String manufacturer, double grade) { // сигнатура метода це назва і все
        // що в дужках Bottle(int volume, String design, String manufacturer, double grade)
        this.volume = volume; // прийнято що параметри конструктора маю мати назву таку саму як наші поля-змінні
        // щоб не було конфлікту java потрібно додавати this. - це силка на поточний клас Bottle
        // якщо ми зробимо тільки volume = volume конструктор не зрозуміє що саме ми хочемо зробити з яким саме volume
        // ми створюємо конструктор який має певні параметри які мають називатись так само як наші змінні об'єктів
        // для того,щоб конструктор зрозумів де параметр volume де змінна volume ми йому вказуємо ця змінна словом this.
        this.design = design;
        this.manufacturer = manufacturer;
//        this.grade = grade; // тут у нас немає перевірки яку ми стоврили в setgrade тому при створенні ми не виконуємо
        // ніякої перевірки і може створитись поганий об'єкт
//        setGrade(grade); // тут вже всі нові об'єкти grade створюються через set через наші перевірки
        // тобто ми беремо параметр з конструктора grade як параметр для входу в метода setGrade через (grade)
        this.setGrade(grade); // можна добавити this - це силка на поточний клас
    }
    // як тільки ми створили конструктор з параметрами ми вже не можемо задвати без параметрів потрбіно
    // створити новий ще один конструктор без параметрів public Bottle(){}

    // ЯК ТІЛЬКИ МИ СТВОРИЛИ КОНСТРУКТОР З ПАРАМЕТРАМИ В Bottle в самого НАСЛІДНИКА Whiskey ВИНИКАЄ ПОМИЛКА
    // ТАК, ЯК ВІН ПОСИЛАЄТЬСЯ НА КОНСТРУКТОР БЕЗ ПАРАМЕТРІВ А ЙОГО ВЖЕ НЕМАЄ
    // вирішення 1 зайти в Whiskey i імлементувати конструктор з bottle
    // вирішення 2 створити в bottle конструктор без параметрів public Bottle(){}

//    public Bottle(){}

    public int getVolume() {
        return volume;
    }

    public String getDesign() {
        return design;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getGrade() {
        return grade;
    }

    public abstract Object getDescription();



    public void setGrade(double grade) {
        if (grade >= 0) {
            this.grade = grade;
        } else {
            this.grade = 0;
        }
    }


}
