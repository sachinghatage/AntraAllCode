package day3;

public class ItemTest {

	
	 private final int id;
	  public ItemTest(int id) { this.id = id; }
	  public void updateId(int newId) { id = newId; }  //cannot change value of final modifier
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ItemTest fa = new ItemTest(42);
		 fa.updateId(69);
		 System.out.println(fa.id);
	}

}
