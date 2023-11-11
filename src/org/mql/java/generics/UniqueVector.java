package org.mql.java.generics;

public class UniqueVector<T> extends Vector<T> implements Set<T> {
	

	@Override
	public boolean AddUniqueItem(T item) {
	        if (!contains(item)) {
	            add(item);
	            return true;
	        }
	        return false;
	}

}
