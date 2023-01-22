package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person("Adam", "Kowalski", 22, "1234567890");
            person.setAge(-5);
            System.out.println(person.getFirstName());
        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
