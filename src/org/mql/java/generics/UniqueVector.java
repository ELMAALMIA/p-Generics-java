package org.mql.java.generics;

public class UniqueVector<T> extends Vector<T> implements Set<T> {
	

	public  UniqueVector() {
		System.out.println("***********test unique vector*********** ");
		
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
	    UniqueVector<Integer> uniqueVector = new UniqueVector<>();

	    uniqueVector.AddUniqueItem(1);
	    uniqueVector.AddUniqueItem(2);
	    uniqueVector.AddUniqueItem(3);
	    uniqueVector.AddUniqueItem(3);
	    uniqueVector.AddUniqueItem(1);

	    System.out.println("Vector:");
	    for (Integer item : uniqueVector) {
	        System.out.println(item);
	    }

	    int removedElement = uniqueVector.remove(2);
	    System.out.println("Remove element at index 2 => " + removedElement);

	    System.out.println("Updated Vector:");
	    for (Integer item : uniqueVector) {
	        System.out.println(item);
	    }

	    System.out.println("Replace element at index 2 with 55");
	    uniqueVector.replace(2, 55);

	    System.out.println("Updated Vector after replacement:");
	    for (Integer item : uniqueVector) {
	        System.out.println(item);
	    }

	    System.out.println("Clears vector");
	    uniqueVector.clear();
	    System.out.println("Size after clear() " + uniqueVector.size());
	}

}
