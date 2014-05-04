package tdd.by.example;

/**
 * Created by benwu on 14-5-3.
 */
public class Franc extends Money {

    private String currency;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public String currency() {
        currency = "CHF";
        return currency;
    }

}
