package interfaces;

import java.util.Scanner;

public interface InputFromUser {
    static String inputText(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
    default double inputDouble(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextDouble();
    }
    default int inputInt(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }
}
