package jsonpractice.entity;

public class Address {
    private String streetAddress;
    private String city;
    private String postalCode;
    private String country;

    public Address(){}

    public Address(String streetAddress, String city, String postalCode, String country) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return " {" +
                "streetAddress:'" + streetAddress + '\'' +
                ", city:'" + city + '\'' +
                ", postalCode:'" + postalCode + '\'' +
                ", country:'" + country + '\'' +
                '}';
    }
}
