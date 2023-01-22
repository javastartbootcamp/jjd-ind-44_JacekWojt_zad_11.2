package pl.javastart.task;

public class IncorrectAgeException extends Exception {
    public IncorrectAgeException() {
        super("Wiek nie może być mniejszy od 1");
    }
}
