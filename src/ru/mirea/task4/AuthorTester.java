package ru.mirea.task4;

public class AuthorTester {

    public static void main(String[] args) {
        Author author = new Author("Andrey Rahmaturov", "a.rahmaturov@mail.ru", 'm');
        System.out.println(author);
        author.setEmail("abcdefg@mail.ru");
        System.out.println(author.getEmail());
    }
}