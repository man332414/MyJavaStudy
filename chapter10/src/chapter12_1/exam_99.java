package chapter12_1;

class Account
{
	int money = 0;
	public int showMoney()
	{
		return money;
	}
	public void setMoney() 
	{
		try {
			Thread.sleep(100);
		} catch (InterruptedException ie) {
			System.out.println(ie.toString());
		}
		this.money += 2000;
		
		System.out.println("어머니가 용돈을 입금했습니다. 현재 잔액 " +this.showMoney());
		
		this.notify();
	}
	
	public void getMoney()
	{
		while(money<=0)
		{
			System.out.println("통장 잔고가 없어서 아들 대기 중");
			try {
				this.wait();
			} 
			catch (InterruptedException e) {}
			
		}
		
		this.money -= 2000;
		System.out.println("아들이 용돈을 출금했습니다. 현재 잔액 " + this.showMoney());
	}
}

class Son extends Thread
{
	Account account;
	
	Son(Account account)
	{
		this.account = account;
	}
	
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			account.getMoney();
		}
	}
}

class Mom extends Thread
{
	Account account;
	Mom(Account account)
	{
		this.account = account;
	}
	
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			account.setMoney();
		}
	}
}

public class exam_99
{

	public static void main(String[] args) 
	{
		Account account = new Account();
		Son son = new Son(account);
		Mom mom = new Mom(account);
		
		son.start();
		mom.start();
	}

}
