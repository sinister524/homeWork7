package ru.geekbrains.homeWork7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
        appetite -= p.getFood();
    }
    public void satietyInfo () {
        if (appetite <= 0) satiety = true;
            System.out.println("Сытость - " + satiety);

    }
    public void catInfo () {
        System.out.println("Зовут - " + name + "\n" + "Аппетит - " + appetite);
    }

    public String getName() {
        return name;
    }
}
