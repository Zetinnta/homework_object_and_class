package ru.skypro;

import java.util.Objects;

public class Book {
    String name;
    int publicationYear;
    Author author;

    public Book(String name, int publicationYear, Author author) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getBookName() {
        return this.name;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return "'" + name + "' " + "published in " + publicationYear + " by " + this.author.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (this.getClass() != other.getClass() || other == null) {
            return false;
        }
        Book b2 = (Book) other;
        return (name.equals(b2.name) && author.equals(b2.author));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publicationYear, author);
    }
}

