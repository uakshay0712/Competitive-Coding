package CoreJava;

public class SmartPhone {
	
	private String brand;
	private String model;
	private int storageCapacity;

	public SmartPhone(String brand, String model, int storageCapacity) {
		this.brand = brand;
		this.model = model;
		this.storageCapacity = storageCapacity;
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}



	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public void increaseCapacity(int value) {
		if(value>0) {
			storageCapacity+=value;
			System.out.println(value);
	
		}
		
	}

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("Redmi", "Note-9", 128);
		
		System.out.println(sp.getBrand());
		System.out.println(sp.getModel());
		System.out.println(sp.getStorageCapacity());
		
		sp.increaseCapacity(128);
		System.out.println("Increased Storage Capacity"+ sp.getStorageCapacity());

	}

}
