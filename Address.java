public class Address {
    // Four Strings representing street, city, state and zip.
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructor that takes four Strings.
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // Method that returns a string representation of the Address object.
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}
