package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author firstAuthor = new Author("Jonathan", "Safran Foer");
        Author secondAuthor = new Author("Michael", "Lieberman");
        Book firstBook = new Book("Everything Is Illuminated", 2002, firstAuthor);
        Book secondBook = new Book("Principles of Plasma Discharges and Materials Processing", 2005, secondAuthor);

        delimiter();
        System.out.println("'" + firstBook.getBookName() + "'" + " published in " + firstBook.getPublicationYear() + " by " + firstAuthor.getAuthorName() + " " + firstAuthor.getAuthorSecondName());
        delimiter();

        firstBook.setPublicationYear(2003);

        System.out.println("'" + firstBook.getBookName() + "'" + " published in " + firstBook.getPublicationYear() + " by " + firstAuthor.getAuthorName() + " " + firstAuthor.getAuthorSecondName());
        delimiter();
        System.out.println("'" + secondBook.getBookName() + "'" + " published in " + secondBook.getPublicationYear() + " by " + secondAuthor.getAuthorName() + " " + secondAuthor.getAuthorSecondName());
        delimiter();
    }

    public static void delimiter() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    }
}