public class Book {
    private String titleBook;
    private Author author;
    private int publicYear;

    Book(String titleBook, Author author, int publicYear) {
        this.titleBook = titleBook;
        this.author = author;
        this.publicYear = publicYear;
    }

    String getTitleBook() {
        return titleBook;
    }

    Author getAuthor() {
        return author;
    }

    int getPublicYear() {
        return publicYear;
    }

    void setPublicYear(int year) {
        publicYear = year;
    }
}
