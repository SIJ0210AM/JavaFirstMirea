package ru.mirea.task8;

public abstract class Shape {
    double width;
    double length;

    public String toString() {
        return "\n[Shape]" +
                "\nwidth: " + width +
                "\ncolor: " + length + "\n";
    }
}