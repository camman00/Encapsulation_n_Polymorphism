package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working

	private int itemsRecieved;
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; //can be any object type except String. Strings get turned into objects.
	
	/*public static void main(String[] args) {
		
	}*/
	public EncapsulateTheData(int itemsRecieved,float degreesTurned,String nomenclature,Object memberObj) {
		this.itemsRecieved = itemsRecieved;
		this.degreesTurned = degreesTurned;
		this.nomenclature = nomenclature;
		this.memberObj = memberObj;
	}
	public int getItemsRecieved() {
		return itemsRecieved;
	}
	public void setItemsRecieved(int itemsRecieved) {
		this.itemsRecieved = itemsRecieved;
	}
	public float getDegreesTurned() {
		return degreesTurned;
	}
	public void setDegreesTurned(float degreesTurned) {
		this.degreesTurned = degreesTurned;
	}
	public String getNomenclature() {
		return nomenclature;
	}
	public void setNomenclature(String nomenclature) {
		this.nomenclature = nomenclature;
	}
	public Object getMemberObj() {
		return memberObj;
	}
	public void setMemberObj(Object memberObj) {
		this.memberObj = memberObj;
	}
}
