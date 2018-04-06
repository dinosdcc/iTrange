package goods;

public class Card extends Good {
	private String rarity;

	public Card(String name, float value, String rarity) {
		super(name, value);
		this.rarity = rarity;
	}
	public String getRarity() {
		return rarity;
	}
	public void setRarity(String rarity) {
		this.rarity = rarity;
	}
}
