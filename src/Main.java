//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Николай", "Гоголь");

        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Мертвые души", author2, 1842);

        book1.setPublicationYear(1873);

        System.out.println(book1.getTitle() + ", " + book1.getPublicationYear());
        System.out.println(book2.getTitle() + ", " + book2.getPublicationYear());

    }
}