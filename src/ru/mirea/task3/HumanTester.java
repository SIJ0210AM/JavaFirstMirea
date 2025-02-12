package ru.mirea.task3;

public class HumanTester {
    public static void main(String[] args) {
        Human human = new Human();

        Human.Head head = new Human.Head();
        Human.Leg leg = new Human.Leg();
        Human.Hand hand = new Human.Hand();

        head.setHairLess(false);
        head.setSize(42);
        System.out.print("\nHairless: " + head.getHairLess());
        System.out.print("\nSize of Head: " + head.getSize() + "\n");

        leg.setMissing(false);
        System.out.print("\nMissing of Leg: " + leg.getMissing() + "\n");

        hand.setMissing(false);
        System.out.print("\nMissing of Hand: " + hand.getMissing() + "\n");
    }
}