public class Person {
    // Two Strings and an Address object representing a person's name and home
    // address.
    private String lastName;
    private String firstName;
    private Address home;

    // Constructor that takes two Strings and an Address object.
    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    // Method that returns a string representation of the Person object.
    public String toString() {
        return firstName + " " + lastName + ", " + home.toString();
    }
}
