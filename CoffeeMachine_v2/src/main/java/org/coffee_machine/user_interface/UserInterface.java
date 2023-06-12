package org.coffee_machine.user_interface;

public class UserInterface {

    private AskCharacteristics askCharacteristics;


    public UserInterface() {
        askCharacteristics = new AskCharacteristics();
    }

    public void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public void startUserSurvey() {
        askCharacteristics.askRequirements();
    }
}
