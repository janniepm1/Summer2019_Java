package Day38customClass;

public class BankAccountObjects {
	public static void main(String[] args) {
		
		BankAccount account1=new BankAccount();
		account1.AccountHolder="Erhan Holly Dolapci";
		account1.AccountNumber=1234567891234567l;
		
		account1.ShowBalance();
		
		account1.Deposit(2000);
		account1.Deposit(4000);
		account1.Withdraw(3000);
		account1.Withdraw(3001);
		
		BankAccount account2=new BankAccount();
		account2.AccountSetUp("Muaz Gulen", 2718392748572639l);
		account2.ShowBalance();
		account2.Deposit(15000);
		account2.Withdraw(8000);
	
BankAccount account3=new BankAccount("Nadire Pilott",4728109284902993l) ;
		account3.ShowBalance();
		
		account3.Deposit(10);
		account3.Withdraw(20);
		account3.Withdraw(200);
		
	}
}
