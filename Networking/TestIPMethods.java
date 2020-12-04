package Networking;

import javax.swing.*;

public class TestIPMethods {
    public static void main(String[] args) {
//        String ipAddress = JOptionPane.showInputDialog(null, "Input an IP Address", "IP Input", JOptionPane.QUESTION_MESSAGE);
//        if(IP.isValid(ipAddress)) {
//            JOptionPane.showMessageDialog(null,"IP Address: " + ipAddress + " is a valid IP", "IP Address Valid", JOptionPane.INFORMATION_MESSAGE);
//        } else
//        {
//            JOptionPane.showMessageDialog(null,"IP Address: " + ipAddress + " is not a valid IP","IP Validation Error", JOptionPane.ERROR_MESSAGE);
//        }

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number", "IP Input", JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null,"Integer in 8Bit Binary form is " + IP.integerToEightBitBinary(num), "IP Address Valid", JOptionPane.INFORMATION_MESSAGE);


    }
}
