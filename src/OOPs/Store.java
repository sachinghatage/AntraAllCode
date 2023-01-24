package day2;

public class Store {

	private String name;
	 private String address;
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Store myStore = new Store("Barb's Store", "333 Main St.");
		 System.out.println(myStore);
		 myStore.setName("Barbara's Store");
		 myStore.setAddress("555 Pine St.");
		 System.out.println(myStore);

	}
	
	


	@Override
	public String toString() {
		return "Store [name=" + name + ", address=" + address + "]";
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Store(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

}
