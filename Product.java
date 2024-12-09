package CoreJava;

public class Product {
	
	private String productName;
	private int productCode;
	private double price;
	
	
	public Product(String productName, int productCode, double price) {
		super();
		this.productName = productName;
		this.productCode = productCode;
		this.price = price;
	}

	
	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getProductCode() {
		return productCode;
	}


	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public void discount(double percentage) {
		if(percentage>0 && percentage<=100) {
			price = price-(price*percentage/100);
			System.out.println(percentage);
				}
	}
	public static void main(String[] args) {
		Product p= new Product("AC", 11213,36000);
		System.out.println(p.getProductName()+" "+p.getProductCode()+" "+"Rs."+p.getPrice());
		

	}

}
