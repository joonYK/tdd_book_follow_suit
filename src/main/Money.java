public abstract class Money {
    protected int amount;

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public static Franc franc(int amount) {
        return new Franc(amount);
    }

    public abstract Money times(int multiplier);
}
