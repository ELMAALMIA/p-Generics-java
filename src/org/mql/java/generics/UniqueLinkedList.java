package org.mql.java.generics;

public class UniqueLinkedList<T> extends LinkedList<T> implements Set<T> {

	public UniqueLinkedList() {
		System.out.println("***********test unique linked list*********** ");
	
	}
	@Override
	public boolean AddUniqueItem(T item) {
		if (!contains(item)) {
			add(item);
			return true;
		}
		return false;
	}

public static void main(String[] args) {
	UniqueLinkedList<Integer> uniqueList = new UniqueLinkedList<>();

	uniqueList.AddUniqueItem(1);
	uniqueList.AddUniqueItem(2);
	uniqueList.AddUniqueItem(3);
	uniqueList.AddUniqueItem(3);
	uniqueList.AddUniqueItem(1);

	System.out.println("List:");
	for (Integer item : uniqueList) {
		System.out.println(item);
	}

	int e = uniqueList.remove(2);

	System.out.println("Remove element index 2 =>" + e);
	for (int i = 0; i < uniqueList.size(); i++) {

		System.out.println(uniqueList.get(i));
	}

	System.out.println("update List:");
	uniqueList.replace(2, 55);
	for (Integer item : uniqueList) {
		System.out.println(item);
	}

	System.out.println("clears list");
	uniqueList.clear();
	System.out.println("size after clear() " + uniqueList.size());

}
}
