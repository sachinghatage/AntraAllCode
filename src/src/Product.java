
 class Product {

	void productCheck(int weight) throws MyException {
		if(weight<100) {
			throw new MyException("product is invalid");
		}
		else
			System.out.println(weight);
	}
	
	
	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub

		Product p=new Product();
		p.productCheck(90);
	}

}
