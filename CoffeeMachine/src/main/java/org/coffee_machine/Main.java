package org.coffee_machine;

import org.coffee_machine.user_interface.UserInterface;

public class Main {

    /**
     * Write here only machine's instances. They must have a start method!
     * */
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();

        userInterface.startUserSurvey();
    }
}