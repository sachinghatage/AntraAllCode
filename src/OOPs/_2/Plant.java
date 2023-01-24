package day4;

public class Plant {

	String getName() { return "plant"; }
	 Plant getType() { return this; }
}

class Flower extends Plant{
    // Flower getType() { return this; }       //compiles fine
   //	String getType() { return  "this"; }  //doesnot compiles
	// Plant getType() { return this; }        //compiles fine
	//Tulip getType() { return newTulip(); }    //doesnot compiles
}

class Tulip extends Flower{
	
}