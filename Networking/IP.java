package Networking;

import java.util.regex.*;

public final class IP {
    public static final int TYPE_SUBNET = 0;
    public static final int TYPE_IP = 1;

    public static boolean isValid(String ipAddress) {

        String regexExpression = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\." + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\." +
                "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])" + "\\." + "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-4])";
        Pattern regexCompiled = Pattern.compile(regexExpression);


        // Using the matcher method provided by the regex package
        Matcher check = regexCompiled.matcher(ipAddress);
        boolean match = check.matches();
        return match;
    }

//    public static String binaryConversion(String input) {
//
//    }
//
//    public static String hexConversion(String input) {
//
//    }

}
