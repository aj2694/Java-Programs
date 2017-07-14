package innerclasses_string_file;

public class Account {

	int accountId;
	String accountName;
	float accountBalance;
	public Account(int accountId, String accountName, float accountBalance) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public float getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}
	public class Locker{
		int lockID;

		public Locker(int lockID) {
			super();
			this.lockID = lockID;
		}

		public void print(){
			System.out.println(accountBalance+""+accountId+""+accountName);
		}
		@Override
		public String toString() {
			return "Locker [lockID=" + lockID + "]";
		}
		
		
	}
}
