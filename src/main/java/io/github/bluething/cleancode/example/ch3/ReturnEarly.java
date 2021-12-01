package io.github.bluething.cleancode.example.ch3;

public class ReturnEarly {
    private boolean systemIsUp;
    
    public String getPersonalInfo(Person person, int pin){
        if (systemIsUp){
            if (person != null && person.getName().equals("")){
                if(person.getPin() != pin){
                    return  "Invalid pin";
                }
                return "Invalid Name";
            }
            return "System is down at the moment";
        }
        return person.getPersonalInfo();
    }
}
