public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount;
    }
}
