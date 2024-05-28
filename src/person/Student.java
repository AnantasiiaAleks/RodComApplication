package person;

import interfaces.InputFromUser;
import interfaces.WriteToFile;

public class Student extends Person implements InputFromUser, WriteToFile {
    public Student(String firstName, String lastName, String patronymic, String telNumber, String birthDate) {
        super(firstName, lastName, patronymic, telNumber, birthDate);
    }

}
