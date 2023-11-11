package org.mql.java.generics;

import java.util.Comparator;

public class TestVector {
	public TestVector() {

		System.out.println("\n    Vector  :");
		testGet();
		testSize();
		testRemove();
		testAddByIndex();
		testIndexOf();
		testContains();
		testReplace();
		testClear();
		testShort();

	}

	public void testGet() {
		Vector<Double> item = new Vector<>();
		item.add(16.5);
		item.add(20.);
		System.out.println(" item 0 " + item.get(0));
		System.out.println(" *********** ");
	}

	public void testSize() {
		Vector<Double> item = new Vector<>();
		item.add(1.5);
		item.add(2.5);
		System.out.println(" size (2) " + item.size());
		System.out.println(" *********** ");
	}

	public void testRemove() {
		Vector<Double> item = new Vector<>();
		item.add(10.5);
		item.add(62.5);
		item.add(39.);
		System.out.println(" size before  " + item.size());

		double e = item.remove(1);

		System.out.println(" size after   " + item.size() + " , item removed " + e);
		System.out.println(" *********** ");
	}

	public void testAddByIndex() {
		Vector<Double> item = new Vector<>();
		item.add(10.0);
		item.add(20.0);
		item.add(1, 15.0);
		System.out.println("elemnt added in index 1: " + item.get(1) + " size " + item.size());
		System.out.println(" *********** ");
	}

	public void testIndexOf() {
		Vector<Double> item = new Vector<>();
		item.add(3.0);
		item.add(7.0);
		item.add(12.0);
		int index = item.indexOf(7.0);
		System.out.println("Index of 7.0: " + index);
		System.out.println(" *********** ");
	}

	public void testContains() {
		Vector<Double> items = new Vector<>();
		items.add(2.5);
		items.add(6.5);
		boolean contains = items.contains(6.5);
		System.out.println("Contains 6.5: " + (contains ? "yes" : "no"));
		System.out.println(" *********** ");
	}

	public void testReplace() {
		Vector<Double> items = new Vector<>();
		items.add(4.0);
		items.add(9.0);
		items.replace(1, 6.0);
		System.out.println("Replace element :  " + items.get(1));
		System.out.println(" *********** ");
	}

	public void testClear() {
		Vector<Double> items = new Vector<>();
		items.add(1.);
		items.add(2.9);
		items.clear();
		System.out.println("Clear : size => " + items.size());
		System.out.println(" *********** ");
	}

	public void testShort() {
		Vector<Integer> items = new Vector<>();
		items.add(3);
		items.add(1);
		items.add(5);
		Comparator<Integer> comparator = Comparator.naturalOrder();
		items.sort(comparator);

		for (int i = 0; i < items.size(); i++) {
			System.out.println(" item[" + i + "] = " + items.get(i));
		}
	}

	public static void main(String[] args) {
		new TestVector();
	}

}
