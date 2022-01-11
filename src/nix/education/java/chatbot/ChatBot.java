package nix.education.java.chatbot;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ChatBot {

    private String chatBotName;

    private String chatBotBirthYear;

    private String chatBotUserName;

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy");

    private static final Scanner SCANNER = new Scanner(System.in);

    public ChatBot(String chatBotName) {
        this.chatBotName = chatBotName;
        this.chatBotBirthYear = DATE_FORMAT.format(new Date());
    }

    public void run() {
        stage1();
        stage2();
    }

    private void stage1() {
        System.out.println("Hello! My name is " + this.chatBotName + ".");
        System.out.println("I was created in " + this.chatBotBirthYear + ".");
    }

    private void stage2() {
        System.out.println("Please, remind me your name.");
        this.chatBotUserName = SCANNER.nextLine();
        System.out.println("What a great name you have, " + this.chatBotUserName + "!");
    }

}
