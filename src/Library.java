import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(int arrLength) {
        books = new Book[arrLength];
    }

    void addBooks(String titleBook, String nameAuthor, String surname, int publicYear) {
        Book add = new Book(titleBook, new Author(nameAuthor, surname), publicYear);
        boolean check = false;
        for (int x = 0; x < books.length; x++) {
            if (books[x] == null) {
                books[x] = add;
                check = false;
                break;
            }
            check = true;
        }
        if (check) {
            System.out.println("Невозможно добавить объект, массив заполнен!");
        }
    }

    void printInfoBook() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) continue;
            System.out.print("\"" + books[i].getAuthor().getName() + " " + books[i].getAuthor().getSurname() + ": ");
            System.out.print(books[i].getTitleBook() + ": ");
            System.out.println(books[i].getPublicYear() + "\"");


        }
    }

    void printInfoBook(String title) {
        String nameBook;
        String nameAuthor;
        int date;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                nameBook = books[i].getTitleBook();
                nameAuthor = books[i].getAuthor().getName() + " " + books[i].getAuthor().getSurname();
                date = books[i].getPublicYear();
                if (nameBook.equals(title)) {
                    System.out.println("The " + nameBook + " by " + nameAuthor + " was published in " + date + ".");
                    return;
                }
            }
        }
        System.out.println("Книга не найдена");
    }

    void setYear(String title, int year) {
        for (Book i : books) {
            if (i != null) {
                if (i.getTitleBook().equals(title)) {
                    i.setPublicYear(year);
                    return;
                }
            }
        }
        System.out.println("Ошибка изменения даты: книга не найдена.");

    }

    public static void main(String[] args) {
        Library lb = new Library(5);
        lb.addBooks("Origin", "Dan", "Brown", 2017);
        lb.addBooks("Harry Potter", "Joanne", "Rowling", 2005);
        lb.addBooks("Vampire", "Ann", "Rice", 2003);
        lb.printInfoBook();

    }
}
