package timer;

import timer.GUI.GUI;

public class Main {

    public static void main(String[] args) {
        try {
            GUI gui = new GUI();

            gui.startGUI();

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

}