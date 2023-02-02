package exam_asdm;


public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a1 = new Account(100120,"abhilash",100000);
		Account a2 = new Account(100121,"omkar",50000);
		Account a3 = new Account(100121,"rohit",125000);
		
		
		System.out.println("balnce of a1 : "+a1.getBalance());
		System.out.println("balance of a2 : "+a2.getBalance());
		System.out.println("balance of a3 : "+a3.getBalance());
		
		a1.transferFunds(a2, 25000);//a1---->a2
		
		System.out.println("\nbalnce of a1 : "+a1.getBalance());
		System.out.println("balance of a2 : "+a2.getBalance());
		
		a3.transferFunds(a2, 25000);//a3--->a2
		
		System.out.println("\nbalnce of a3 : "+a3.getBalance());
		System.out.println("balance of a2 : "+a2.getBalance());
		
		a1.transferFunds(a3,25000);//a1----->a3
		System.out.println("\nbalance of a1 :"+a1.getBalance());
		System.out.println("balance of a3 :"+a3.getBalance());
	}

}
