// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// list is a innerface, whats a set =  unique values, bolleans, true/falue, passing values, return values, hash/Map, create methods that remove and add, incapsulation
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Person person1 = new Person("Joe", 14);
        System.out.println(person1);
        Person person2 = new Person("Kieran", 2);
        person2.display();


        Book book1 = new Book("Goosebumps", "RL Stine", "Thriller", 89);
        Book book2 = new Book("Programming Logic", "Joyce Ferrell", "Comp Sci", 25);
        System.out.println(book1);
        System.out.println(book2);

        System.out.println(Book.numBooks);
    }
}