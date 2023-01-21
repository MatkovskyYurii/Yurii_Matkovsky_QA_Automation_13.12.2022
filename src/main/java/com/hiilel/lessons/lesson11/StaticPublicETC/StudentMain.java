package com.hiilel.lessons.lesson11.StaticPublicETC;

public class StudentMain {
    public static void main(String[] args) {
        runApp();
        Student student1 = new Student("Yurii", "Matkovksky");
        Student student2 = new Student("Alex", "Matkovksky", 25);
        Student student3 = new Student("Oleg", "Matkovksky", 25, 11.1);

        Student.counter = 10;
        System.out.println(Student.counter);

        System.out.println(student1.counter);
        System.out.println(student2.counter);
        System.out.println(student2.counter);

        System.out.println();
        System.out.println();
        System.out.println();

        Demo.printVariable(); // це поведінка на рівні класу
        System.out.println(Student.counter); // це властивість на рівні класу
        System.out.println(student1.getAvgPoint());
        student1.setAvgPoint(11.1);

        student1 = null; // для того, щоб видалити змінну, але об'єкт залишається в пам'яті heap

//        Math.PI - приклад статичного значення PI в класі Math яке ми можемо викликати будь-де не створюючи окремого
//        об'єкту для того, щоб дізнатись PI, наприклад Math PI = new Math;

    }
    static void runApp(){
        Student student1 = new Student("Yurii", "Matkovksky");
    }
}
