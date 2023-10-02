public class CreditCard {
    // Three Money objects and one Person object, representing the balance, credit
    // limit, owner, and amount charged.
    private Money balance;
    private Money creditLimit;
    private Person owner;
    // I've added this Money object to keep track of how much has been charged using
    // the
    // charge() method. This is useful for making sure that the credit limit is not
    // exceeded over multiple charges.
    private Money charged;

    // Constructor that takes one Person object and one Money object.
    public CreditCard(Person newCardHolder, Money limit) {
        balance = new Money(0, 0);
        creditLimit = limit;
        owner = newCardHolder;
        charged = new Money(0, 0);
    }

    // Gets the balance of the credit card.
    public Money getBalance() {
        return balance;
    }

    // Gets the credit limit of the credit card.
    public Money getCreditLimit() {
        return creditLimit;
    }

    // Gets the information about the owner of the credit card.
    public String getPersonals() {
        return owner.toString();
    }

    // Charges the credit card.
    public void charge(Money amount) {
        // If the amount to be charged is less than or equal to the credit limit, moves
        // on to the next step.
        if (amount.compareTo(creditLimit) <= 0) {
            // If the amount to be charged, plus the amount previously charged, is less than
            // or equal to the credit limit, adds the amount to the balance and updates the
            // amount charged.
            if ((amount.add(charged).compareTo(creditLimit)) <= 0) {
                balance = balance.add(amount);
                System.out.println("Charge: " + amount.toString());
                charged = charged.add(amount);
                // If the amount to be charged, plus the amount previously charged, is greater
                // than the credit limit, prints out an error message.
            } else {
                System.out.println("Credit limit exceeded!");
            }
            // If the amount to be charged is greater than the credit limit, prints out an
            // error message.
        } else {
            System.out.println("Credit limit exceeded!");
        }
    }

    // Makes a payment on the credit card.
    public void payment(Money amount) {
        // If the balance is greater than or equal to the amount to be paid, subtracts
        // the amount from the balance.
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            System.out.println("Payment: " + amount.toString());
            // If the balance is less than the amount to be paid, prints out an error
            // message.
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
