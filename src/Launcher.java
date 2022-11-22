public class Launcher {
    public static void main(String[] args) {
        Book origin = new Book("Origin", new Author("Dan", "Brown"), 2017);
        Book potter = new Book("Harry Potter", new Author("Joanne", "Rowling"), 2005);
        potter.setPublicYear(2007);
    }
}
