import java.util.Arrays;

public class Launcher {

    static void addBooks(Book[] arr, Book add) {
        boolean check = false;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == null) {
                arr[x] = add;
                check = false;
                break;
            }
            check = true;
        }
        if (check) {
            System.out.println("Невозможно добавить объект, массив заполнен!");
        }
    }

    public static void main(String[] args) {
        Book origin = new Book("Origin", new Author("Dan", "Brown"), 2017);
        Book potter = new Book("Harry Potter", new Author("Joanne", "Rowling"), 2005);
        Book vampire = new Book("Vampire", new Author("Ann", "Rice"), 2003);

        potter.setPublicYear(2007);

        Book[] books = new Book[5];
        books[0] = origin;
        books[4] = potter;
        addBooks(books, vampire);
        System.out.println(Arrays.toString(books));
    }


}

