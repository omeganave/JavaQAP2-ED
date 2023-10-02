public class TestCreditCard {
    public static void main(String[] args) {
        // The following code is nearly identical to the example provided. The only
        // difference is the way that the Money objects are constructed. Instead of
        // being provided with one double, they are provided with two longs.
        final Money LIMIT = new Money(1000, 0);
        final Money FIRST_AMOUNT = new Money(200, 0);
        final Money SECOND_AMOUNT = new Money(10, 02);
        final Money THIRD_AMOUNT = new Money(25, 0);
        final Money FOURTH_AMOUNT = new Money(990, 0);

        Person owner = new Person("Christie", "Diane", new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));

        CreditCard visa = new CreditCard(owner, LIMIT);
        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());
        System.out.println();
        System.out.println("Attempt to charge " + FIRST_AMOUNT);

        visa.charge(FIRST_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Attempt to charge " + SECOND_AMOUNT);
        visa.charge(SECOND_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Attempt to pay " + THIRD_AMOUNT);
        visa.payment(THIRD_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Attempt to charge " + FOURTH_AMOUNT);
        visa.charge(FOURTH_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
    }
}