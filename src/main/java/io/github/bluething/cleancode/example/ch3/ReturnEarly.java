package io.github.bluething.cleancode.example.ch3;

public class ReturnEarly {
    private boolean systemIsUp;

    public String getPersonalInfo(Person person, int pin){
        if(!systemIsUp) return "System is down at the moment";

        if(person != null && person.getName().equals("")) return "Invalid Name";

        if(person.getPin() != pin) return "Invalid pin";

        return person.getPersonalInfo();
    }
}
