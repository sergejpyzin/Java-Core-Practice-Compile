package ru.serjeypyzin.javacore.regular;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormingString {

    private  String dateFormat (){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return localDateTime.format(dateTimeFormatter);
    }



    public  String formingString () {
        UserInteraction userInteraction = new UserInteraction();
        String answerUser = dateFormat() + " -> " + userInteraction.requestToUser("Введите содержимое заметки:");
        System.out.println(answerUser);
        return answerUser;
    }
}
