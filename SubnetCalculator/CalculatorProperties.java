package SubnetCalculator;

import Networking.IP;

import java.util.Arrays;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CalculatorProperties {

    private static final String IPV4_REGEX = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-4]?|[3-9]\\d?)$";
    private char networkClass;
    private String[] ipAddress;
    private String[] binaryIPAddress; //
    private String[] subnetMask;
    private String[] binarySubnetAddress; //
    private String[] hexadecimalSubnetAddress;
    private int subnetBits;
    private int maximumSubnets;
    private String firstOctetRange;
    private String[] wildcardMask;
    private int maskBits;
    private int hostsPerSubnet;
    private String hostAddressRange;
    private String[] subnetID;
    private String[] broadcastAddress;
    private String[] subnetBitmap;

    public CalculatorProperties() {
        setIpAddress(new String[]{"10","0","0","1"});
        setSubnetMask(new String[]{"255","0","0","0"});
    }

    public char getNetworkClass() {
        return networkClass;
    }

    public void setNetworkClass(char networkClass) {
        this.networkClass = networkClass;
    }

    public String[] getIpAddress() {
        return Arrays.copyOf(ipAddress,ipAddress.length);
    }

    public void setIpAddress(String[] ipAddress) {
        setBinaryIPAddress(ipAddress);
        this.ipAddress = ipAddress;
    }

    public String[] getBinaryIPAddress() {
        return Arrays.copyOf(binaryIPAddress,binaryIPAddress.length);
    }

    private void setBinaryIPAddress(String[] binaryIPAddress) {
        this.binaryIPAddress = Arrays.copyOf(binaryIPAddress,binaryIPAddress.length);
    }

    public String[] getSubnetMask() {
        return Arrays.copyOf(subnetMask,subnetMask.length);
    }

    public void setSubnetMask(String[] subnetMask) {
        this.subnetMask = Arrays.copyOf(subnetMask, subnetMask.length);
    }

    public String[] getBinarySubnetAddress() {
        return Arrays.copyOf(binarySubnetAddress,binarySubnetAddress.length);
    }

    public void setBinarySubnetAddress(String[] binarySubnetAddress) {
        this.binarySubnetAddress = Arrays.copyOf(binarySubnetAddress,binarySubnetAddress.length);
    }

    public int getSubnetBits() {
        return subnetBits;
    }

    public void setSubnetBits(int subnetBits) {
        this.subnetBits = subnetBits;
    }

    public int getMaximumSubnets() {
        return maximumSubnets;
    }

    public void setMaximumSubnets(int maximumSubnets) {
        this.maximumSubnets = maximumSubnets;
    }

    public String getFirstOctetRange() {
        return firstOctetRange;
    }

    public void setFirstOctetRange(String firstOctetRange) {
        this.firstOctetRange = firstOctetRange;
    }

    public String[] getWildcardMask() {
        return Arrays.copyOf(wildcardMask,wildcardMask.length);
    }

    public void setWildcardMask(String[] wildcardMask) {
        this.wildcardMask = wildcardMask;
    }

    public int getMaskBits() {
        return maskBits;
    }

    public void setMaskBits(int maskBits) {
        this.maskBits = maskBits;
    }

    public int getHostsPerSubnet() {
        return hostsPerSubnet;
    }

    public void setHostsPerSubnet(int hostsPerSubnet) {
        this.hostsPerSubnet = hostsPerSubnet;
    }

    public String getHostAddressRange() {
        return hostAddressRange;
    }

    public void setHostAddressRange(String hostAddressRange) {
        this.hostAddressRange = hostAddressRange;
    }

    public String[] getSubnetID() {
        return subnetID;
    }

    public void setSubnetID(String[] subnetID) {
        this.subnetID = Arrays.copyOf(wildcardMask,wildcardMask.length);
    }

    public String[] getBroadcastAddress() {
        return broadcastAddress;
    }

    public void setBroadcastAddress(String[] broadcastAddress) {
        this.broadcastAddress = Arrays.copyOf(broadcastAddress,broadcastAddress.length);
    }

    public String[] getSubnetBitmap() {
        return Arrays.copyOf(subnetBitmap,subnetBitmap.length);
    }

    public void setSubnetBitmap(String[] subnetBitmap) {
        this.subnetBitmap = Arrays.copyOf(subnetBitmap,subnetBitmap.length);
    }

    private static String integerToEightBitBinary(int octet) {
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

    private static String[] integerArrayToBinaryArray(final String[] ip_address) {
        String[] eight_bit_binary_address = new String[4];
        for(int i = 0; i < ip_address.length; i++) {
            eight_bit_binary_address[i] = IP.integerToEightBitBinary(Integer.parseInt(ip_address[i]));
        }
        return eight_bit_binary_address;
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

    public static boolean isValid(String ipAddress) {
        Pattern compiledRegex = Pattern.compile(IPV4_REGEX);
        // Using the matcher method provided by the regex package
        Matcher check = compiledRegex.matcher(ipAddress);
        boolean match = check.matches();
        return match;
    }
}
