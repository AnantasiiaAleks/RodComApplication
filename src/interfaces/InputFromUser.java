package interfaces;

import java.util.Scanner;

public interface InputFromUser {
    default String inputText(String message){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    default double inputDouble(String message){
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    default int inputInt(String message){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
