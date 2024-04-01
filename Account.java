package exceptionEx;  //inheritance:상속  //상속패키지에서 exception 패키지로 복사해옴
//은행계좌클래스(국민은행) => 멤버변수 접근제한자로 보호, getter, setter 설정
public class Account {
	//멤버변수(필드)
	String accountNo;  //계좌번호
	String ownerName;  //예금주이름
	private int balance;  //잔액
	
	//생성자  => ctrl+space 누르면 빈클래스가 나옴.
	public Account() {
		
	}

	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	//예금한다 메서드
	void deposit(int amount) {
		balance+=amount;
	}
	
	//인출한다 메서드
	int withdraw(int amount) throws InsufficientException {
		if(balance < amount) {
			throw new InsufficientException("잔고 부족("+(amount-balance)+"원 모자람)"); 
		}
		balance-=amount;
		return amount;
	}
            public int getbalance
            ~~~~~~~
}
