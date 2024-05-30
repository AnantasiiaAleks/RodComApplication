package person;

import interfaces.DateValidator;
import interfaces.InputFromUser;
import interfaces.NamesValidator;
import interfaces.PhoneNumberValidator;

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
        if (NamesValidator.isValid(middleName)) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (NamesValidator.isValid(middleName)) {
            this.lastName = lastName;
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (NamesValidator.isValid(middleName)){
            this.middleName = middleName;
        }
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        if (PhoneNumberValidator.isValid(telNumber)) {
            this.telNumber = telNumber;
        }
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        if (DateValidator.isValid(birthDate)) {
            this.birthDate = birthDate;
        }
    }

    public String toString() {
        return firstName + " " + lastName + " " + middleName + " " + birthDate + " " + telNumber;
    }

    public void AddNewPerson(){
        setLastName(InputFromUser.inputText("Фамилия: "));
        setFirstName(InputFromUser.inputText("Имя: "));
        setMiddleName(InputFromUser.inputText("Отчество: "));
        setBirthDate(InputFromUser.inputText("Дата рождения: "));
        setTelNumber(InputFromUser.inputText("Номер телефона: "));
    }
}
