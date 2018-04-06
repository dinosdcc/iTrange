package portfolio;

import java.util.List;

import goods.Good;

public class Portfolio {
	List<Good> goods;
	List<Good> wanted;
	List<Transaction> transactions;
	int totalRealMoney;
	int totalWantedMoney;
	public Portfolio(List<Good> goods, List<Good> wanted, List<Transaction> transactions){
		this.goods = goods;
		this.wanted = wanted;
		this.transactions = transactions;
		this.totalRealMoney = getTotalRealMoney();
		this.totalWantedMoney = getTotalWantedMoney();
	}
	private int getTotalWantedMoney() {
		// TODO Auto-generated method stub
		return 0;
	}
	private int getTotalRealMoney() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
