package money;

import person.Student;

public abstract class Money {
    protected double amount;
    protected Student child;

    public Money (double amount, Student child) {
        this.amount = amount;
        this.child = child;
    }

    public String toString() {
        return child + ": " + amount;
    }
}
