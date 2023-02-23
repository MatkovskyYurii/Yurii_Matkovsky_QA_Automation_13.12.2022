package com.hiilel.lessons.lesson12.main;

import com.hiilel.lessons.lesson12.abstraction.BottleProduct;
import com.hiilel.lessons.lesson12.shop.Beer;
import com.hiilel.lessons.lesson12.shop.Whiskey;

public class Main2 {
    public static void main(String[] args) {
        BottleProduct bottleProduct = new Beer(500, "beer", "cool", 0.55,
                "Black");
        // створення об'єкта в абстрактному класі (до нього не можна достукатись через get)
        // можна отримати все тільки з абстрактного класу BottleProduct
        // не можна отримати змінні методи і тд від його child beer whiskey
 

        Beer beer = new Beer(500, "beer", "cool", 0.55,
                "Yek");




        printDesign(beer);
    }
    // метод який приймає = (BottleProduct bottleProduct) = абстрактний об'єкт
    // - типу всі хто створився в інших класах child попали
    // в абстрактний і тепер ми можемо передавати абстрактий об'єкт і користуватись реальними об'єктами які
    // наслідуються від нього в методі printDesign(beer); beer(не абстрактний) child від BottleProduct абстрактний
    public static void printDesign(BottleProduct bottleProduct ){
        System.out.println(bottleProduct.getDescription());
    }
}
