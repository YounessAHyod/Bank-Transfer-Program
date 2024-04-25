class Account {
    private String owner;
    private int balance;
    private String accountNumber;

    public Account(String owner, int balance, String accountNumber) {

        this.owner = owner;

        this.balance = balance;

        this.accountNumber = accountNumber;

    }

    public int getBalance()
    {

        return balance;
    }

    public void transfer(int amount) throws NotEnoughMoneyException {

        if (amount > balance) {

            throw new NotEnoughMoneyException("Transfer amount exceeds account balance, please deposit more funds or choose a lower transfer amount.");
        }

        balance -= amount;
    }

    public void deposit(int amount) {

        balance += amount;
    }

    public String getOwner() {

        return owner;
    }
}

class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String message) {

        super(message);
    }
}