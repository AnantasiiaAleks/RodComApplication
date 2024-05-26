package person;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String telNumber;
    private String birthDate;

    public Person (String firstName, String lastName,
                   String patronymic, String telNumber, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.telNumber = telNumber;
        this.birthDate = birthDate;
    }
    public String toString() {
        return firstName + " " + lastName + " " + patronymic + " " + birthDate + " " + telNumber;
    }
}
