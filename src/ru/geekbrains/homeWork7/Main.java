package ru.geekbrains.homeWork7;

public class Main {

    public static void main(String[] args) {
        Cat [] cats = new Cat[5];
        cats [0] = new Cat("Кузя", 10,false);
        cats [1] = new Cat("Мусик", 30, false);
        cats [2] = new Cat("Цисси", 15, false);
        cats [3] = new Cat("Марсик", 50, false);
        cats [4] = new Cat("Васька", 20, false);
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0;i < 5; i++) {
            cats[i].catInfo();
            cats [i].eat(plate);
            cats[i].satietyInfo();
            plate.info();
        }
    }
}
