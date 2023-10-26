enum CardType {
    VISA, MasterCard
}

class Buyer extends User {

    @Override
    void changeNumber(String number) {
    }

    @Override
    void changeFullName(String data) {

    }


    private CardType cardType;
    private String creditCardNumber;
    private double creditCardBalance;

    public Buyer(String fullName, long iin, String contactNumber, CardType cardType, String creditCardNumber, double creditCardBalance) {
        super(fullName, iin, contactNumber);
        this.cardType = cardType;
        if (validateCreditCardNumber(creditCardNumber)) {
            this.creditCardNumber = creditCardNumber;
        } else {
            throw new IllegalArgumentException("Номер карты должен содержать 16 цифр.");
        }
        this.creditCardBalance = creditCardBalance;
    }

    public CardType getCardType() {
        return cardType;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public double getCreditCardBalance() {
        return creditCardBalance;
    }


    private boolean validateCreditCardNumber(String creditCardNumber) {
        // Проверка на длину номера кредитной карты
        return creditCardNumber.matches("\\d{16}");
    }

    public void buyLaptop(Laptop laptop, Salesman salesman) {
    }

    public void buyMobile(Mobile mobile, Salesman salesman) {
    }
}

