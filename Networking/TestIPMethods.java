package Networking;

import javax.swing.*;

public class TestIPMethods {
    public static void main(String[] args) {
        String ipAddress = JOptionPane.showInputDialog(null, "Input an IP Address", "IP Input", JOptionPane.QUESTION_MESSAGE);
        if(IP.isValid(ipAddress)) {
            JOptionPane.showMessageDialog(null,"IP Address: " + ipAddress + " is a valid IP", "IP Address Valid", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null,"IP Address: " + ipAddress + " is not a valid IP","IP Validation Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
