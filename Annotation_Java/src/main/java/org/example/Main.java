package org.example;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Получаем аннотацию
        AuthorInfo authorInfo = Book.class.getAnnotation(AuthorInfo.class);
        if (authorInfo != null) {
            System.out.println("Author name: " + authorInfo.authorName());
            System.out.println("Author email: " + authorInfo.authorEmail());
        }
    }
}