package depndency.injection;

public class Address {

    private int houseNo;
    private String city;
    private int pinCode;
    private String state;

    public Address(int houseNo, String city, int pinCode, String state) {
        this.houseNo = houseNo;
        this.city = city;
        this.pinCode = pinCode;
        this.state = state;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public String getCity() {
        return city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public String getState() {
        return state;
    }
}