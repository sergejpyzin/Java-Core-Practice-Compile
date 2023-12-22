package ru.serjeypyzin.javacore.regular;

import java.util.Scanner;

public class UserInteraction {
    public void menu() {
        WriteFile writer = new WriteFile();

        System.out.println("Здравствуйте вы запустили тестовое приложение для добавления заметок.");
        String pathToFile = requestToUser("Введите имя файла (без расширения):") + ".txt";
        do {
            writer.fileWriter(pathToFile);
            String requestToContinue = requestToUser("Вы хотите продолжить ввод заметок (y/n):");

            if (requestToContinue.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        } while (true);


    }

    public  String requestToUser(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
