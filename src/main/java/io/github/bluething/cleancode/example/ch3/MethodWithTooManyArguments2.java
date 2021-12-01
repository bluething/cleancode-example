package io.github.bluething.cleancode.example.ch3;

public class MethodWithTooManyArguments2 {
    public static void main(String[] args) {
        String greeting = new EmailSender().constructTemplateEmail("Mr.", "John", "Smith");
        System.out.println(greeting);
    }

    private static class EmailSender {
        String constructTemplateEmail(String title, String name, String surname) {
            return String.format("Dear %s %s %s", title, name, surname);
        }
    }
}
