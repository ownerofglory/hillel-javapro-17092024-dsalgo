package ua.ithillel.dsalgo.model.address;

public class Address {
    private String street;
    private String number;
    private String city;
    private String state;
    private String zip;
    private String country;

    public Address(String street, String number, String city, String state, String zip, String country) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }
}
