package exam_asdm;


public class Account {

	private int accountNo;
	
	private String name;
	
	private float balance;
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public Account(int accountNo, String name, float balance) {
	
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	
	public void deposit(float depositAmount) {
		balance += depositAmount;
	}
	
	public void withdraw(float withdrawAmount) {
		balance -= withdrawAmount;
	}
	
	public void transferFunds(Account toAccount,float amountToTransfer) {
		this.withdraw(amountToTransfer);
		toAccount.deposit(amountToTransfer);
	}
	
	
}
