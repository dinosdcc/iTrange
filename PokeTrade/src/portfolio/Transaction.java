package portfolio;

import goods.Good;

public class Transaction {
	boolean answer; // 1 si la transaccion fue exitosa
	Good goodGiven;
	Good goodReceived;
	public Transaction(boolean answer, Good goodGiven, Good goodReceived) {
		this.answer = answer;
		this.goodGiven = goodGiven;
		this.goodReceived = goodReceived;
	}
	public boolean getAnswer() {
		return answer;
	}
	public Good getGoodGiven() {
		return goodGiven;
	}
	public Good getGoodReceived() {
		return goodReceived;
	}
	public void setAnswer(boolean answer) {
		this.answer = answer;
	}
	public void setGoodGiven(Good goodGiven) {
		this.goodGiven = goodGiven;
	}
	public void setGoodReceived(Good goodReceived){
		this.goodReceived = goodReceived;
	}
}
