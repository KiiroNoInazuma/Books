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

    static void printBooks(Book[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                continue;
            System.out.print("\"" + array[i].getAuthor().getName() + " " + array[i].getAuthor().getSurname() + ": ");
            System.out.print(array[i].getTitleBook() + ": ");
            System.out.println(array[i].getPublicYear() + "\"");


        }
    }


    public static void main(String[] args) {
        Book origin = new Book("Origin", new Author("Dan", "Brown"), 2017);
        Book potter = new Book("Harry Potter", new Author("Joanne", "Rowling"), 2005);
        Book vampire = new Book("Vampire", new Author("Ann", "Rice"), 2003);

        potter.setPublicYear(2007);

        Book[] books = new Book[5];
        books[1] = origin;
        books[4] = potter;
        addBooks(books, vampire);
        printBooks(books);


    }


}

