package ru.mirea.task2;

public class ClassTester {

    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.width = 2;
        shape.length = 5;
        System.out.print(shape.toString());

        Ball ball = new Ball();
        ball.setData(2.5, "blue");
        System.out.print(ball.toString());

        Book book = new Book();
        book.setData("Harry Potter and Filosofal Stone", "Novel",
                "Joanne Rowling", 1997, 432);
        System.out.print(book.toString());

        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog.setData("Ralf", 2);
        dog1.setData("Grisha", 6);
        dog2.setData("Lord", 3);

        TestDogs testDogs = new TestDogs();
        testDogs.addDogs(dog, dog1, dog2);

        for(int i = 0; i < testDogs.dogs.length; i++) {
            System.out.print("\nDog[" + i+ "]");
            System.out.print(testDogs.dogs[i].toString());
        }
    }
}