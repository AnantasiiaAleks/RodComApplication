import interfaces.InputFromUser;
import person.Student;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Внесите сведения об ученике:");
        String studentFirstName = InputFromUser.inputText("Фамилия: ");
        String studentLastName = InputFromUser.inputText("Имя: ");
        String studentPatronymic = InputFromUser.inputText("Отчество: ");
        String studentTelNumber = InputFromUser.inputText("Дата рождения: ");
        String studentBirthDate = InputFromUser.inputText("Телефон: ");

        Student student1 = new Student(studentFirstName, studentLastName, studentPatronymic,
                studentTelNumber, studentBirthDate);
        System.out.println(student1);
        //student1.writeToFile(student1.toString(), "C:\\Users\\chiff\\Documents\\JavaProjects\\RodComApplication\\src\\data");
        System.out.println("Saved!");
    }
}
