package day3;

public class Item {

	private String desc;
	
	public String getDescription() {
		return desc;
	}
	
	public void setDescription(String d) {
		desc=d;
	}
	
	public static Item modifyDesc(Item item,String desc) {
		
		item=new Item();
		item.setDescription(desc);
		return item;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item it=new Item();
		it.setDescription("gobstopper");
		
		Item it2=new Item();
		it2.setDescription("fizzylifting");
		
		modifyDesc(it,"scrum");
		System.out.println(it.getDescription());
		System.out.println(it2.getDescription());
	}

}
