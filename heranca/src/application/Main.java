package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		/*UPCASTING
		Instancia uma subclasse num objeto da super classe. Isso é possível pois 
		uma business account não deixa de ser uma account, então pode ser instaciada
		como uma account */
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		/* DOWNCASTING 
		É converter um objeto da superclasse para a subclasse, mas para que isso seja
		possível, é preciso castar manualmente o tipo da subclasse */
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		// Testes do método Override implementado na SavingsAccount e na BusinessAccount
		
		Account account = new Account(1005, "Julio", 1000.00);
		account.withdraw(200.0);
		System.out.println(account.getBalance());
		
		Account account2 = new SavingsAccount(1006, "Alpinista", 1000.00, 0.01);
		account2.withdraw(200);
		System.out.println(account2.getBalance());
		
		Account account3 = new BusinessAccount(1007, "Morfeu", 1000.00, 2000.0);
		account3.withdraw(200);
		System.out.println(account3.getBalance());
		
		// Polimorfismo
		
		Account x = new Account(1008, "Tina", 1000.00);
		Account y = new SavingsAccount(1009, "Rodolfo", 1000.00, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
