package org.mql.java.generics.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.Test;
import org.mql.java.generics.List;
import org.mql.java.generics.Vector;

class VectorTests {

	// test size
	@Test
	void testVectorSize() {
		List<Object> data = new Vector<>();
		data.add("Une chaîne");
		data.add(20);
		data.add(12.5);

		assertEquals(3, data.size());
	}

	// get test + add
	@Test
	void testVectorGet() {
		List<Double> data = new Vector<>();
		data.add(25.3);
		data.add(20.);
		data.add(12.5);

		assertEquals(25.3, data.get(0));
	}

	// remove by index
	@Test
	void testVectorRemove() {
		List<Double> data = new Vector<>();
		data.add(25.3);
		data.add(20.);
		data.add(12.5);

		assertEquals(25.3, data.remove(0));
		assertEquals(2, data.size());

	}

	// test replace
	@Test
	void testReplace() {
		List<Double> data = new Vector<>();
		data.add(25.3);
		data.add(20.);
		data.add(12.5);
		data.replace(0, 10.5);
		assertEquals(10.5, data.get(0));
	}

	// add by index
	@Test
	void testVectorAddByIndex() {
		List<Double> data = new Vector<>();
		data.add(25.3);
		data.add(20.);
		data.add(1, 12.5);

		assertEquals(12.5, data.get(1));
		assertEquals(2, data.indexOf(20.));
		assertEquals(3, data.size());
	}

	// search by index
	@Test
	void testVectorIndexOf() {
		List<Double> data = new Vector<>();
		data.add(25.3);
		data.add(20.);
		data.add(12.5);
		assertEquals(1, data.indexOf(20.));
		assertEquals(3, data.size());
	}

	// test contains
	@Test
	void testVectorclears() {
		List<Double> data = new Vector<>();
		data.add(25.3);
		data.add(20.);
		data.add(12.5);
		assertEquals(false, data.contains(12.));
		assertEquals(3, data.size());
		data.clear();
		assertEquals(0, data.size());
	}

	// test conatins
	@Test
	void testVectorContains() {
		List<Double> data = new Vector<>();
		data.add(25.3);
		data.add(20.);
		data.add(12.5);
		assertEquals(false, data.contains(12.));
	}
	
	
	@Test 
	void testShort() {
		List<Double> data = new Vector<>();
		data.add(25.3);
		data.add(20.);
		data.add(12.5);
		data.sort(Comparator.naturalOrder());
  
		assertEquals(true, data.isSorted(Comparator.naturalOrder()));
	}
	 
	

}
