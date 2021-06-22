package pl.javastart.library.app;

import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.8";

        Book[] books = new Book[1000];

        DataReader dataReader = new DataReader();
        books[0] = dataReader.readAndCreateBook();
        books[1] = dataReader.readAndCreateBook();
        dataReader.close();

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        books[0].printInfo();
        books[1].printInfo();
    }
}
