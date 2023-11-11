package org.mql.java.generics;


public class TestLinkedList {
	public TestLinkedList() {
		System.out.println("\n    LinkedList  :");

		testGet();
		System.out.println(" *********** ");
		testSize();
		System.out.println(" *********** ");
		testRemove();
		System.out.println(" *********** ");
		testAddByIndex();
		System.out.println(" *********** ");
		testIndexOf();
		System.out.println(" *********** ");
		testContains();
		System.out.println(" *********** ");
		testReplace();
		System.out.println(" *********** ");
		testClear();
		// testSort();

	}

	public void testGet() {
		List<String> list = new LinkedList<>("AYOUB");
		list.add("BILAL");
		list.add("SAAD");
		System.out.println(" Get ELEMENT: " + list.get(1));
	}

	public void testSize() {
		List<Double> list = new LinkedList<>();
		list.add(1.5);
		list.add(2.5);
		System.out.println("Test (2 ELEMENT): " + list.size());
	}

	public void testRemove() {
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("c");
		System.out.println(" List SIZE BEFORE RM: " + list.size());
		String removedItem = list.remove(1);
		System.out.println(" Removed item: " + removedItem + ", List SIZE: " + list.size());
	}

	public void testAddByIndex() {
		LinkedList<Character> list = new LinkedList<>();
		list.add('A');
		list.add('C');
		System.out.println(" BEFORE AddByIndex:(get(1)) " + list.get(1));
		list.add(1, 'B');
		System.out.println(" AddByIndex: " + list.get(1));
	}

	public void testIndexOf() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		int index = list.indexOf(20);
		System.out.println("Test IndexOf: " + index);
	}

	public void testContains() {
		LinkedList<Boolean> list = new LinkedList<>();
		list.add(true);
		list.add(false);
		boolean contains = list.contains(true);
		System.out.println("Contains: " + (contains ? "yes" : "no"));
	}

	public void testReplace() {
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		System.out.println("BEFORE " + list.get(1));
		list.replace(1, "C");
		System.out.println("Replace A By C: " + list.get(1));
	}

	public void testClear() {
		LinkedList<String> list = new LinkedList<>();
		list.add("Item1");
		list.add("Item2");
		list.clear();
		System.out.println("Clear:  size after clear: " + list.size());
	}

	public static void main(String[] args) {
		new TestLinkedList();
	}
}
