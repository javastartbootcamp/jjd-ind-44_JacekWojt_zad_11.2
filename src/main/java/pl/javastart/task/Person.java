package pl.javastart.task;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws NameUndefinedException, IncorrectAgeException {
        if (firstName == null) {
            this.setFirstName(null);
        }
        if (lastName == null) {
            this.setLastName(null);
        }
        if (firstName.length() < 2) {
            this.setFirstName("");
        }
        if (lastName.length() < 2) {
            this.setLastName("");
        }
        if (age < 1) {
            this.setAge(-1);
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() throws NameUndefinedException {
        if (firstName == null) {
            throw new NameUndefinedException("Nazwisko nie może być null");
        }
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedException {
        if (firstName == null) {
            throw new NameUndefinedException("Imię nie może być null");
        }
        if (firstName.length() < 2) {
            throw new NameUndefinedException("Imię musi być dłuższe niż dwa znaki");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        if (lastName == null) {
            throw new NameUndefinedException("Nazwisko nie może być null");
        }
        if (firstName.length() < 2) {
            throw new NameUndefinedException("Imię musi być dłuższe niż dwa znaki");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        if (age < 1) {
            throw new IncorrectAgeException();
        }
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
