package springcnstrargs;

public class Credit {
	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Credit(int money) {
		super();
		this.money = money;
	}

	public Credit() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Credit [money=" + money + "]";
	}

	
	

}
