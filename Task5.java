public class Task5 {
    static class Book {
        String title;
        String author;
        boolean isAvailable;
    }

    static class Library {
        Book book = new Book();

        public Library() {
            book.title = "Четверте Крило";
            book.author = "Ребекка Яррос";
            book.isAvailable = true;
        }

        void checkoutBook() {
            book.isAvailable = false;
            System.out.println("Книга видана: " + book.title + " - " + book.author);
        }

        void returnBook() {
            book.isAvailable = true;
            System.out.println("Книга повернута: " + book.title + " - " + book.author);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.checkoutBook();
        library.returnBook();
    }
}

