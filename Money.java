public class Money {
    // Two longs representing dollars and cents
    private long dollars;
    private long cents;

    // Constructor that takes two longs. Using just a single double did not work
    // properly with the methods, and didn't seem to be the best way to do it.
    public Money(long dollars, long cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    // Constructor that copies an existing Money object.
    public Money(Money amount) {
        this.dollars = amount.dollars;
        this.cents = amount.cents;
    }

    // Add two Money objects together. If the sum of the cents is greater than 100,
    // adds one dollar and subtracts 100 from the sum of cents.
    public Money add(Money amount) {
        if (this.cents + amount.cents >= 100) {
            return new Money(this.dollars + amount.dollars + 1, this.cents + amount.cents - 100);
        } else {
            return new Money(this.dollars + amount.dollars, this.cents + amount.cents);
        }
    }

    // Subtract one Money object from another. If the difference of the cents is
    // less than 0, subtracts one dollar and adds 100 to the difference of cents.
    public Money subtract(Money amount) {
        if (this.cents - amount.cents < 0) {
            return new Money(this.dollars - amount.dollars - 1, this.cents - amount.cents + 100);
        } else {
            return new Money(this.dollars - amount.dollars, this.cents - amount.cents);
        }
    }

    // Compare two Money objects. Returns 0 if equal, -1 if this is less than
    // amount, 1 if this is greater than amount.
    public int compareTo(Money amount) {
        if (this.dollars == amount.dollars) {
            if (this.cents == amount.cents) {
                return 0;
            }
            return this.cents > amount.cents ? 1 : -1;
        } else {
            return this.dollars > amount.dollars ? 1 : -1;
        }
    }

    // Compare two Money objects. Returns true if equal, false if not.
    public boolean equals(Money amount) {
        return this.dollars == amount.dollars && this.cents == amount.cents;
    }

    // Return a string representation of the Money object.
    public String toString() {
        // Formats the cents properly.
        String centsString = String.format("%02d", this.cents);
        return "$" + this.dollars + "." + centsString;
    }
}