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

//    public static int[] addressToArray(String ip_address) {
//
//    }
//
//    public static int[] integerArrayToBinaryArray(int[] ip_address) {
//
//    }
//
//    public static int[] integerArrayToHexArray() {
//
//    }
//
//    private static String arrayToString(int[] Array) {
//
//    }
//
//    private static String arrayToString(String[] Array) {
//
//    }
//
//    public static char findIPClass(int[] ip_address) {
//
//    }

    public static String integerToEightBitBinary(int integer) {
        String eight_bit_binary = "";
        for(int i=128; integer > 0; i/=2)
        {
            eight_bit_binary += ((integer>=i) ? "1" : "0");
            if(integer>=i)
                integer-=i;
        }
        while((8 - eight_bit_binary.length()) > 0) {
            eight_bit_binary+="0";
        }
        return eight_bit_binary;
    }

//    public static String eightBitBinaryToInteger(String eightBitBinary) {
//
//    }

}
