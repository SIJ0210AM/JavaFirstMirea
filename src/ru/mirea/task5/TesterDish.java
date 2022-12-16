package ru.mirea.task5;

public class TesterDish {
    public static void main(String[] args) {

        Plate plate = new Plate("ceramics", true,
                false);
        System.out.print("\nPlate Deep: " + plate.getDeep());
        System.out.print("\nPlate Dirty: " + plate.getDirty());
        System.out.print("\n" + plate.washDishes());
    }
}