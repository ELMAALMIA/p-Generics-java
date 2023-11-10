package org.mql.java.generics;

import java.util.Iterator;

public class LinkedList<T> implements List<T> , Iterable<T>{
	private T value;
	private LinkedList<T> next;

	public LinkedList() {
		value = null;
		next = null;
	}

	public LinkedList(T value) {
		this.value = value;
		next = null;
	}

	@Override
	public void add(T item) {
		if (isEmpty())
			value = item;
		else if (next == null)
			next = new LinkedList<T>(item);
		else
			next.add(item);
	}

	@Override
	public T get(int index) {
		if (index == 0)
			return value;
		if (next == null)
			return null;
		return next.get(index - 1);
	}

	@Override
	public int size() {
		if (isEmpty())
			return 0;
		if (next == null)
			return 1;
		return 1 + next.size();
	}

	@Override
	public T remove(int index) {
		T itemRemoved =null;
		 if (index == 0) {
		         itemRemoved = value;
		        if (next != null) {
		            value = next.value;
		            next = next.next;
		        } else {
		            value = null;
		        }
		        return itemRemoved;
		    } else if (next != null) {
		        return next.remove(index - 1);
		    } else {
		        return itemRemoved;
		    }
	}

	@Override
	public boolean isEmpty() {
		return (value == null && next == null);
	}

	@Override

		public void add(int index, T item) {
		    if (index == 0) {
		        LinkedList<T> list = new LinkedList<>(item);
		        list.next = this.next;
		        this.next = list;
		    } else if (next != null) {
		        next.add(index - 1, item);
		    }
		

	}

	@Override
	public int indexOf(T item) {
		if (item.equals(value)) {
	        return 0;
	    } else if (next != null) {
	        int index = next.indexOf(item);
	        return (index == -1) ? -1 : 1 + index;
	    } else {
	        return -1;
	    }
	}

	@Override
	public boolean contains(T item) {
		return indexOf(item) != -1;
	
	}

	@Override
	public void replace(int index, T item) {
		 if (index == 0) {
		        value = item;
		    } else if (next != null) {
		        next.replace(index - 1, item);
		    }

	}

//	@Override
//	public Iterator<T> iterator() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public void clear() {
		 value = null;
		    next = null;

	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public Iterator<T> iterator() {
	    return new LinkedListPointer(this);
	}

	private class LinkedListPointer implements Iterator<T> {
	    private LinkedList<T> current;

	    public LinkedListPointer(LinkedList<T> list) {
	        this.current = list;
	    }

	    @Override
	    public boolean hasNext() {
	        return current != null;
	    }

	    @Override
	    public T next() {
	        T element = current.value;
	        current = current.next;
	        return element;
	    }
	}



}
