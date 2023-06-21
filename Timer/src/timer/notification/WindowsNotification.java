package timer.notification;

import java.awt.*;

public class WindowsNotification {

    private String title;
    private String content;

    public WindowsNotification(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void sendNotification() {
        if (SystemTray.isSupported()) {
            displayTray();
        } else {
            System.err.println("System tray not supported!");
        }
    }

    private void displayTray() {
        try {
            SystemTray tray = SystemTray.getSystemTray();

            Image image = Toolkit.getDefaultToolkit().createImage("");

            TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
            trayIcon.setImageAutoSize(true);
            trayIcon.setToolTip("System tray icon demo");
            tray.add(trayIcon);

            trayIcon.displayMessage(title, content, TrayIcon.MessageType.INFO);

        } catch (AWTException exception) {
            System.out.println(exception);
        }
    }
}
