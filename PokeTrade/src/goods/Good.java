package goods;

public class Good {
	private String name;
	private float value;
	public Good(String name, float value) {
		this.name = name;
		this.value = value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public float getValue() {
		return value;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
