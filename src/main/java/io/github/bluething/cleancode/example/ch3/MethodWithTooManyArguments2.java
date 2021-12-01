package io.github.bluething.cleancode.example.ch3;

public class MethodWithTooManyArguments2 {
    public static void main(String[] args) {
        String greeting = new EmailSender().constructTemplateEmail("Mr.", "John", "Smith");
        System.out.println(greeting);

        Person john = new Person("Mr.", "John", "Smith");
        String greeting2 = new EmailSender().constructTemplateEmail(john);
        System.out.println(greeting2);
    }

    static class Person {
        private final String title;
        private final String name;
        private final String surname;

        Person(String title, String name, String surname) {
            this.title = title;
            this.name = name;
            this.surname = surname;
        }

        public String getTitle() {
            return title;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }
    }

    private static class EmailSender {
        String constructTemplateEmail(String title, String name, String surname) {
            return String.format("Dear %s %s %s", title, name, surname);
        }

        String constructTemplateEmail(Person person) {
            String title = person.getTitle();
            String name = person.getName();
            String surname = person.getSurname();

            // populate email template with the args
            return String.format("Dear %s %s %s", title, name, surname);
        }
    }
}
