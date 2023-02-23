package com.hiilel.lessons.lesson15Exception.main;

import java.io.FileNotFoundException;
import java.util.Objects;

public class Cat {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name) {
        if (Objects.nonNull(name)) {
            this.name = name;
        } else {
            System.out.println("name can not be null");
        }
    }
    /*
     Exception - це клас в якого є дві наслідники це
     RuntimeException - переважно по винні програміста (вийшли за межі масиву
     IOException - input output exception в нас відпала база і ми не можемо з неї щось прочитати, наприклад
     FileNotFoundException - коли ви пробуєте вичитати звідтам текстові данні але може бути не правильний шлях до цього
     файлу
     Checked exception -
     Unchecked exception - ми не перевіряємо їх по винні програміста помилки в коді
    */
}
