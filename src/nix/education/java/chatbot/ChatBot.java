package nix.education.java.chatbot;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatBot {

    private String chatBotName;

    private String chatBotBirthYear;

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy");

    public ChatBot(String chatBotName) {
        this.chatBotName = chatBotName;
        this.chatBotBirthYear = DATE_FORMAT.format(new Date());
    }

    public void run() {
        stage1();
    }

    private void stage1() {
        System.out.println("Hello! My name is " + this.chatBotName + ".");
        System.out.println("I was created in " + this.chatBotBirthYear + ".");
    }

}
