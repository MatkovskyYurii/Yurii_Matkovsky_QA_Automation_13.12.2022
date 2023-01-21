package com.hiilel.lessons.lesson11.StaticPublicETC;

public class Student {

    static int counter = 0; // статична змінна властивість саме класу Student !! Важливо !! якщо ми задали це значення
    // в якомусь місці одному то надалі воно завжди буде однакове де б ми його не виконували для кожної конкретноЇ
    // змінної!!
    // Garbage collector ніколи не очищає таку змінну
    protected String name; // не статична змінна властивість саме об'єкту знизу Student
    // Garbage collector може очистити таку змінну
    // protected - доступ саме в межах пакету в якому лежить цей клас якщо створити ще один пакет в середині
    // цього пакету де лежить protected буде помилка. Доступний тільки в межах одного власного пакета.
    // Є хитрість можна зробити наслідування головного пакету Student -> StudentChild і
    // StudentChild буде мати доступу до змінної protected name в межахй свого класу
    public String secondName; //public-модифікатор доступу який дає можливість використувати змінну String secondName
    // з будь-якого місця Global
    int age;// якщо не вказано модифікатора доступу він буде називатись default або package private
    private double avgPoint; // лише в межах цього класу Student
//    private final double avgPoint; final означає що значення змінної є фінальним і його більше не можна змінити після
    // його ініціалізації в об'єкті 1 раз
    // Використання конструктора в конструкторі, через перший конструктор ми можемо налаштовувати всі методи для
    // всіх наступних, наприклад south стоїть тільки в 1, а друкуємо всі конструктори, значення 0-0.0 в цьому
    // випадку дефолтні
    // це потрібно для того якщо у вас багато конструкторів і вам потрібно додавати якийсь метод, щоб не додавати
    // в кожен ми робимо таку послідовність
    public Student(String name, String secondName, int age, double avgPoint) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.avgPoint = avgPoint;
        System.out.println(this);
    }

    public Student(String name, String secondName, int age) {
        this(name, secondName,age,0.0);
    }

    public Student(String name, String secondName) {
        this(name, secondName,0);
    }

    // Getter для того щоб отримати значенням з private (get отримання) не можливо змінити всерівно
    // назва завжди get і назва нашої змінної
    public double getAvgPoint() {
        return avgPoint;
    }

    // Setter метод для зміни значення зміної з private модифікатором (set встановлення)
    // назва завжди set і назва нашої змінної
    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", avgPoint=" + avgPoint +
                '}';
    }
}
