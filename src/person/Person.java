package person;

import interfaces.InputFromUser;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String telNumber;
    private String birthDate;

    public Person (String firstName, String lastName,
                   String middleName, String telNumber, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.telNumber = telNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String toString() {
        return firstName + " " + lastName + " " + middleName + " " + birthDate + " " + telNumber;
    }

    public void AddNewPerson(){
        lastName = InputFromUser.inputText("Фамилия: ");
        firstName = InputFromUser.inputText("Имя: ");
        middleName = InputFromUser.inputText("Отчество: ");
        birthDate = InputFromUser.inputText("Дата рождения: ");
        telNumber = InputFromUser.inputText("Номер телефона: ");

    }
}
