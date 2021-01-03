public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money)obj;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }
}
