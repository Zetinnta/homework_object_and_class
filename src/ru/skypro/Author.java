package ru.skypro;

import java.util.Objects;

public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getAuthorName() {
        return this.firstName;
    }

    public String getAuthorSecondName() {
        return this.secondName;
    }

    @Override
    public String toString() {
        return firstName + " " + secondName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (this.getClass() != other.getClass() || other == null) {
            return false;
        }
        Author a2 = (Author) other;
        return (firstName.equals(a2.firstName) && secondName.equals(a2.secondName));
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }
}

