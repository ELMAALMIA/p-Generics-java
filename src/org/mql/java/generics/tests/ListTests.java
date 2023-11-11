package org.mql.java.generics.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mql.java.generics.List;
import org.mql.java.generics.Vector;

class ListTests {

	@Test
	void testVectorSize() {
		List<Object> data = new Vector<>();
		data.add("Une chaîne");
		data.add(20);
		data.add(12.5);

		assertEquals(3, data.size());
	}

	@Test
	void testVectorGet() {
		List<Double> data = new Vector<>();
		data.add(25.3);
		data.add(20.);
		data.add(12.5);

		assertEquals(25.3, data.get(0));

	}

}
