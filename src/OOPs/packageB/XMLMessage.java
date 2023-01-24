package Monday23.packageB;

import Monday23.packageA.Message;

public class XMLMessage extends Message{

	String getText() { return "<msg>text</msg>";}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new XMLMessage().getText());
	
	}

}
