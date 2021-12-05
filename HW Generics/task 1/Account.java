import java.math.BigDecimal;

abstract class Account {
    public String accountNumber;
    public String ownerName;
    public BigDecimal balance;

    public Account(String aN, String oN, BigDecimal b) {
        accountNumber = aN;
        ownerName = oN;
        balance = b;
    }

    abstract public void credit(BigDecimal balance);

    abstract public void debit(BigDecimal balance);

}

class RegualarAccount extends Account {
    RegualarAccount(String aN, String oN, BigDecimal b) {
        super(aN, oN, b);
    }

    public void credit(BigDecimal balance) {
        this.balance.subtract(balance);
    }

    public void debit(BigDecimal balance) {
        this.balance.add(balance);
    }
}

class PremiumAccount extends Account {
    PremiumAccount(String aN, String oN, BigDecimal b) {
        super(aN, oN, b);
    }

    public void credit(BigDecimal balance) {
        this.balance.subtract(balance);
    }
    public void debit(BigDecimal balance) {
        this.balance.add(balance);
    }
}

class GoldenAccount extends Account {
    GoldenAccount(String aN, String oN, BigDecimal b) {
        super(aN, oN, b);
    }

    public void credit(BigDecimal balance) {
        this.balance.subtract(balance);
    }
    public void debit(BigDecimal balance) {
        this.balance.add(balance);
    }
}

class ATM<T extends Account> {
    public void withdraw(T account, BigDecimal amount) {
        account.credit(amount);
    }

    public void deposit(T account, BigDecimal amount) {
        account.debit(amount);
    }
}