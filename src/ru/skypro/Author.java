package ru.skypro;
public class Author {
    private String name;
    private String secondName;

    public Author(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getAuthorName() {
        return this.name;
    }

    public String getAuthorSecondName() {
        return this.secondName;
    }
}

