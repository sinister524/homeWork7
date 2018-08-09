package ru.geekbrains.homeWork7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void info() {
        if (food <= 0) System.out.println("Еды не хватает");
        else System.out.println("Еда в миске: " + food);
    }

    public int getFood() {
        return food;
    }
}
