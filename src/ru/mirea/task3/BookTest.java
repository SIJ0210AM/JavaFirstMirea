package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args) {

        Book book = new Book();

        book.setName("Harry Potter and Filosofal Stone");
        book.setGenre("Novel");
        book.setAuthor("Joanne Rowling");
        book.setYear(1997);
        book.setCountPages(432);

        System.out.print(book.toString());
    }
}