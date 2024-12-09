package CoreJava;

public class Desktop {
	
	private  String brand;
	private String processor;
	private long ramSize;
	
	
	public Desktop(String brand, String processor, long ramSize) {
		this.brand = brand;
		this.processor = processor;
		this.ramSize = ramSize;
	}

	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}


	public long getRamSize() {
		return ramSize;
	}

	public void setRamSize(long ramSize) {
		this.ramSize = ramSize;
	}
	
	
	public void increasedRam(int value) {
		if(value>0) {
			ramSize+=value;
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
		Desktop desktop = new Desktop("Asus","Ryzen-5", 16);
		
		System.out.println(desktop.getBrand());
		System.out.println(desktop.getProcessor());
		System.out.println(desktop.getRamSize());
		
		desktop.increasedRam(8);
		
		System.out.println(desktop.ramSize);

	}

}
