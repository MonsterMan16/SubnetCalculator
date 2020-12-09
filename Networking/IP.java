package Networking;

import java.util.Arrays;
import java.util.regex.*;


public final class IP {
    private static final String IPV4_REGEX = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-4]?|[3-9]\\d?)$";

    public static boolean isValid(String ipAddress) {
        Pattern compiledRegex = Pattern.compile(IPV4_REGEX);
        // Using the matcher method provided by the regex package
        Matcher check = compiledRegex.matcher(ipAddress);
        boolean match = check.matches();
        return match;
    }

    public static String[] addressToArray(String ip_address) {
        String[] addressArray = new String[4];
          for(int i= 0; i < addressArray.length; i++) {
              if(i == 3) {
                  addressArray[i] = ip_address.substring(0,ip_address.length());
                  continue;
              }
              addressArray[i] = ip_address.substring(0,ip_address.indexOf("."));
              ip_address = ip_address.substring((ip_address.indexOf(".")+1),ip_address.length());
          }
        return Arrays.copyOf(addressArray,addressArray.length);
    }

    public static String[] integerArrayToBinaryArray(final String[] ip_address) {
        String[] eight_bit_binary_address = new String[4];
        for(int i = 0; i < ip_address.length; i++) {
            eight_bit_binary_address[i] = IP.integerToEightBitBinary(Integer.parseInt(ip_address[i]));
        }
        return eight_bit_binary_address;
    }
//
    public static String[] integerArrayToHexidecimalArray(final String[] ip_address) {
        String[] eight_bit_binary_address = new String[4];
        for(int i = 0; i < ip_address.length; i++) {
            eight_bit_binary_address[i] = IP.integerToHexidecimal(Integer.parseInt(ip_address[i]));
        }
        return eight_bit_binary_address;
    }
//
//
//    public static char findIPClass(int[] ip_address) {
//
//    }
    public static String integerToHexidecimal(int octet) {
        String hexadecimal = "";
        while(octet > 0) {
            int temp = octet % 16;
            octet /= 16;
            switch(temp) {
                case 10:
                    hexadecimal = "A" + hexadecimal;
                    break;
                case 11:
                    hexadecimal = "B" + hexadecimal;
                    break;
                case 12:
                    hexadecimal = "C" + hexadecimal;
                    break;
                case 13:
                    hexadecimal = "D" + hexadecimal;
                    break;
                case 14:
                    hexadecimal = "E" + hexadecimal;
                    break;
                case 15:
                    hexadecimal = "F" + hexadecimal;
                    break;
                default:
                    hexadecimal = temp + hexadecimal;
            }
        }
        if(hexadecimal.length() < 2) {
            hexadecimal = 0 + hexadecimal;
        }
        return hexadecimal;
    }

    public static String integerToEightBitBinary(int octet) {
        String eight_bit_binary = "";
        for(int i=128; octet > 0; i/=2)
        {
            eight_bit_binary += ((octet>=i) ? "1" : "0");
            if(octet>=i)
                octet-=i;
        }
        while((8 - eight_bit_binary.length()) > 0) {
            eight_bit_binary += "0";
        }
        return eight_bit_binary;
    }

    public static String addressArrayToString(String[] addressArray) {
        String address = "";
        for(int i = 0; i < addressArray.length; i++) {
            if(i == (addressArray.length - 1)) {
                address += addressArray[i];
                continue;
            }
            address += addressArray[i] + ".";
        }
        return address;
    }

    public static char firstOctetRange(String[] address) {
        if(Integer.parseInt(address[0]) >= 0 && Integer.parseInt(address[0]) <= 0) {
            return 'A';
        } else if(Integer.parseInt(address[0]) >= 128 && Integer.parseInt(address[0]) <= 191) {
            return 'B';
        } else {
            return 'C';
        }
    }

//    public static String findWildcardMask(String subnet) {
//
//    }
}
