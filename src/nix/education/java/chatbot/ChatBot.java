package nix.education.java.chatbot;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

public class ChatBot {

    private String chatBotName;

    private String chatBotBirthYear;

    private String chatBotUserName;

    private Integer chatBotUserAge;

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy");

    private static final Scanner SCANNER = new Scanner(System.in);

    public ChatBot(String chatBotName) {
        this.chatBotName = chatBotName;
        this.chatBotBirthYear = DATE_FORMAT.format(new Date());
    }

    public void run() {
        stage1();
        stage2();
        stage3();
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

    private void stage3() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = SCANNER.nextInt();
        int remainder5 = SCANNER.nextInt();
        int remainder7 = SCANNER.nextInt();
        this.chatBotUserAge = ageCalculation(remainder3, remainder5, remainder7);
        System.out.println("Your age is " + this.chatBotUserAge + "; that's a good time to start programming!");
    }

    private int ageCalculation(int remainder3, int remainder5, int remainder7) {
        return (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
    }

}
