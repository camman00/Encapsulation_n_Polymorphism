package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulationTest {

	@Test
	void test() {
		int data = 10;
		float degreesTurned = 360;
		String nomen = "wrffewfew";
		Object memberObj = null;
		EncapsulateTheData encapsulateTheData = new EncapsulateTheData(data,degreesTurned,nomen,memberObj);
		assertEquals(data, encapsulateTheData.getItemsRecieved());
		assertEquals(degreesTurned, encapsulateTheData.getDegreesTurned());
		assertEquals(nomen, encapsulateTheData.getNomenclature());
		assertEquals(memberObj, encapsulateTheData.getMemberObj());
	}

}
