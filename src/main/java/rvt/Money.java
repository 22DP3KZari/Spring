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
        } // Add this closing brace for the minus method

        public boolean equals(Object compared) {
            // if the variables are located in the same position, they are equal

            if (this == compared) {
                return true;
            }

            // if the compared object is not of type Money, the objects are not equal
            if(!(compared instanceof Money)) {
                return false;
            }

            // convert the object into a Money object
            Money comparedMoney = (Money) compared;

            // if the values of the object variables are equal, the objects are equal
            if (this.euros == comparedMoney.euros && this.cents == comparedMoney.cents) {
                return true;
            } else {
                return false;
            }
        }
    }