package SubnetCalculator;

public class Network {

    private char network_class;
    private String ip_address;
    private String binary_ip_address;
    private String subnet_mask;
    private int subnet_bits;
    private int maximum_subnets;
    private String first_octet_range;
    private String hexIPAddress;
    private String wildcard_mask;
    private int mask_bits;
    private int hosts_per_subnet;
    private String host_address_range;
    private String subnet_id;
    private String broadcast_address;
    private String binary_subnet_address;

    public char getNetwork_class() {
        return network_class;
    }

    public void setNetwork_class(char network_class) {
        this.network_class = network_class;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getBinary_ip_address() {
        return binary_ip_address;
    }

    public void setBinary_ip_address(String binary_ip_address) {
        this.binary_ip_address = binary_ip_address;
    }

    public String getSubnet_mask() {
        return subnet_mask;
    }

    public void setSubnet_mask(String subnet_mask) {
        this.subnet_mask = subnet_mask;
    }

    public int getSubnet_bits() {
        return subnet_bits;
    }

    public void setSubnet_bits(int subnet_bits) {
        this.subnet_bits = subnet_bits;
    }

    public int getMaximum_subnets() {
        return maximum_subnets;
    }

    public void setMaximum_subnets(int maximum_subnets) {
        this.maximum_subnets = maximum_subnets;
    }

    public String getFirst_octet_range() {
        return first_octet_range;
    }

    public void setFirst_octet_range(String first_octet_range) {
        this.first_octet_range = first_octet_range;
    }

    public String getHexIPAddress() {
        return hexIPAddress;
    }

    public void setHexIPAddress(String hexIPAddress) {
        this.hexIPAddress = hexIPAddress;
    }

    public String getWildcard_mask() {
        return wildcard_mask;
    }

    public void setWildcard_mask(String wildcard_mask) {
        this.wildcard_mask = wildcard_mask;
    }

    public int getMask_bits() {
        return mask_bits;
    }

    public void setMask_bits(int mask_bits) {
        this.mask_bits = mask_bits;
    }

    public int getHosts_per_subnet() {
        return hosts_per_subnet;
    }

    public void setHosts_per_subnet(int hosts_per_subnet) {
        this.hosts_per_subnet = hosts_per_subnet;
    }

    public String getHost_address_range() {
        return host_address_range;
    }

    public void setHost_address_range(String host_address_range) {
        this.host_address_range = host_address_range;
    }

    public String getSubnet_id() {
        return subnet_id;
    }

    public void setSubnet_id(String subnet_id) {
        this.subnet_id = subnet_id;
    }

    public String getBroadcast_address() {
        return broadcast_address;
    }

    public void setBroadcast_address(String broadcast_address) {
        this.broadcast_address = broadcast_address;
    }

    public String getBinary_subnet_address() {
        return binary_subnet_address;
    }

    public void setBinary_subnet_address(String binary_subnet_address) {
        this.binary_subnet_address = binary_subnet_address;
    }
}
