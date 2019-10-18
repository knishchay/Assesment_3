public class Stock {
	private int sCode;
	private String productName;
	private float cost;
	private int quantity;
	public Stock(int sCode, String productName,float cost, int quantity) {
		super();
		this.sCode = sCode;
		this.productName = productName;
		this.cost = cost;
		this.quantity = quantity;
	}
	public int getSCode() {
		return sCode;
	}
	public void setSCode(int sCode) {
		this.sCode = sCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getQuant() {
		return quantity;
	}
	public void setQuant(int quant) {
		this.quantity = quant;
	}
	@Override
	public String toString() {
		return "Stock [Code=" + sCode + ", ProductName=" + productName + ", cost=" + cost + ", Quantity=" + quantity
				+ "]";
	}
	

}

