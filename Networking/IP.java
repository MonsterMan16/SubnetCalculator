package Networking;

import java.util.regex.*;


public final class IP {
    public static final int TYPE_SUBNET = 0;
    public static final int TYPE_IP = 1;
    private static final String IPV4_REGEX_OCTET = "(\\d{1,3})";
    private static final String IPV4_REGEX = "^" + IPV4_REGEX_OCTET + IPV4_REGEX_OCTET + IPV4_REGEX_OCTET + "(\\d{1,3})$";

    public static boolean isValid(String ipAddress) {
        Pattern compiledRegex = Pattern.compile(IPV4_REGEX);
        // Using the matcher method provided by the regex package
        Matcher check = compiledRegex.matcher(ipAddress);
        boolean match = check.matches();
        return match;
    }

    public static int[] addressToArray(String ip_address) {
        int[] addressArray = new int[4];
          for(int i= 0; i < addressArray.length; i++) {
              if(i == 3) {
                  addressArray[i] = Integer.parseInt(ip_address.substring(0,ip_address.length()));
                  continue;
              }
              addressArray[i] = Integer.parseInt(ip_address.substring(0,ip_address.indexOf(".")));
              ip_address = ip_address.substring((ip_address.indexOf(".")+1),ip_address.length());
//              ip_address = ip_address.replace((IPV4_REGEX_OCTET + "\\."),"");
          }
        return addressArray;
    }

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
