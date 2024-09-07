class Solution {
    public String defangIPaddr(String address) {
        String ns = address.replace(".", "[.]");
        return ns;
    }
}