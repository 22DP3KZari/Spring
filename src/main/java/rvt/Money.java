package rvt;
public class Money {

    private final int euros;
    private final int cents;
    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int newEuros = this.euros + added.euros;
        int newCents = this.cents + added.cents;
        if (newCents >= 100) {
            newEuros += 1;
            newCents -= 100;
        }
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }

    public Money less(Money less) {
        int newEuros = this.euros - less.euros;
        int newCents = this.cents - less.cents;

        if (newCents < 0) {
            newEuros-=1;
            newCents += 100;
        }
        
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }

    public Money minus(Money minus) { 
        int newEuros = this.euros - minus.euros;
        int newCents = this.cents - minus.cents;

        if (newCents < 0) {
            newEuros-=1;
            newCents += 100;
        }
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
}