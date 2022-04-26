package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author firstAuthor = new Author("Jonathan", "Safran Foer");
        Author secondAuthor = new Author("Michael", "Lieberman");
        Book firstBook = new Book("Everything Is Illuminated", 2002, firstAuthor);
        Book secondBook = new Book("Principles of Plasma Discharges and Materials Processing", 2005, secondAuthor);

        delimiter();
        System.out.println("'" + firstBook.getBookName() + "'" + " published in " + firstBook.getPublicationYear() + " by " + firstBook.getAuthor().getAuthorName() + " " + firstBook.getAuthor().getAuthorSecondName());
        delimiter();

        firstBook.setPublicationYear(2003);

        System.out.println("'" + firstBook.getBookName() + "'" + " published in " + firstBook.getPublicationYear() + " by " + firstBook.getAuthor().getAuthorName() + " " + firstBook.getAuthor().getAuthorSecondName());
        delimiter();
        System.out.println("'" + secondBook.getBookName() + "'" + " published in " + secondBook.getPublicationYear() + " by " + secondBook.getAuthor().getAuthorName() + " " + secondBook.getAuthor().getAuthorSecondName());
        delimiter();

        // Объекты и классы ч. 2

        System.out.println(firstBook.toString());
        Author thirdAuthor = new Author("Jonathan", "Safran Foer");
        Book thirdBook = new Book("Everything Is Illuminated", 2004, thirdAuthor);
        System.out.println("Author Jonathan Safran Foer is already in the database? - " + thirdAuthor.equals(firstAuthor));
        System.out.println("'" + "Everything is Illuminated" + "' with the same author is already in the database? - " + thirdBook.equals(firstBook));
    }

    public static void delimiter() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    }
}