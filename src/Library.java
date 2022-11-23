public class Library {
    private Book[] books;

    public Library(int arrLength) {
        books = new Book[arrLength];
    }

    void addBooks(Book add) {
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

    void printAllBooks(Book[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) continue;
            System.out.print("\"" + array[i].getAuthor().getName() + " " + array[i].getAuthor().getSurname() + ": ");
            System.out.print(array[i].getTitleBook() + ": ");
            System.out.println(array[i].getPublicYear() + "\"");


        }
    }

    void printTitleBook(String title) {
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

        Book origin = new Book("Origin", new Author("Dan", "Brown"), 2017);
        Book potter = new Book("Harry Potter", new Author("Joanne", "Rowling"), 2005);
        Book vampire = new Book("Vampire", new Author("Ann", "Rice"), 2003);
        Library lb = new Library(5);
        lb.addBooks(vampire);
        lb.printTitleBook("Vampire");
        lb.setYear("Vampire", 2004);
        lb.printTitleBook("Vampire");

    }
}
