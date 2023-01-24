package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person("Adam", "Kowalski", 18, "1234567890");
            System.out.println(person.getAge());
            person.setAge(-2);
            System.out.println(person.getAge());
        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
