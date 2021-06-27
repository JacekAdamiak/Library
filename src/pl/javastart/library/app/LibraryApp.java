package pl.javastart.library.app;

public class LibraryApp {

    private static final String APP_NAME = "Biblioteka v1.1";

    public static void main(String[] args) {

        final String appName = APP_NAME;
        System.out.println(appName);

        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();

    }
}
