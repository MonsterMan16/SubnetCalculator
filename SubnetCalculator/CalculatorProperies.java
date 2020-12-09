package SubnetCalculator;

public class CalculatorProperies {


    private char networkClass;
    private String[] ipAddress;
    private String[] binaryIPAddress; //
    private String[] subnetMask;
    private String[] binarySubnetAddress; //
    private int subnetBits;
    private int maximumSubnets;
    private String firstOctetRange;
    private String[] hexIPAddress;
    private String[] wildcardMask;
    private int maskBits;
    private int hostsPerSubnet;
    private String hostAddressRange;
    private String[] subnetID;
    private String[] broadcastAddress;
    private String[] subnetBitmap;


    public CalculatorProperies() {
        setNetworkClass('A');
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
        return ipAddress;
    }

    public void setIpAddress(String[] ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String[] getBinaryIPAddress() {
        return binaryIPAddress;
    }

    private void setBinaryIPAddress(String[] binaryIPAddress) {
        this.binaryIPAddress = binaryIPAddress;
    }

    public String[] getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(String[] subnetMask) {
        set
        this.subnetMask = subnetMask;
    }

    public String[] getBinarySubnetAddress() {
        return binarySubnetAddress;
    }

    public void setBinarySubnetAddress(String[] binarySubnetAddress) {
        this.binarySubnetAddress = binarySubnetAddress;
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

    public String[] getHexIPAddress() {
        return hexIPAddress;
    }

    public void setHexIPAddress(String[] hexIPAddress) {
        this.hexIPAddress = hexIPAddress;
    }

    public String[] getWildcardMask() {
        return wildcardMask;
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
        this.subnetID = subnetID;
    }

    public String[] getBroadcastAddress() {
        return broadcastAddress;
    }

    public void setBroadcastAddress(String[] broadcastAddress) {
        this.broadcastAddress = broadcastAddress;
    }

    public String[] getSubnetBitmap() {
        return subnetBitmap;
    }

    public void setSubnetBitmap(String[] subnetBitmap) {
        this.subnetBitmap = subnetBitmap;
    }
}
