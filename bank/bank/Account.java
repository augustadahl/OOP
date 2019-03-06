package bank;

public class Account {

	private double saldo;
	private String password;
	
	public Account(String pass) {
		saldo = 0;
		password = pass;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposit(double amount) {
		if (amount > 0 && amount < 100000) {
			saldo += amount;
		}
	}

	public void withdraw(double amount, String pass) {
		if (amount > 0 && saldo >= amount && password.equals(pass)) {
			saldo -= amount;
		}
	}

}
