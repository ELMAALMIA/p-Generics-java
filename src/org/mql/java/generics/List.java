package org.mql.java.generics;



public interface List<T> {

	public void add(T item);

	public void add(int index, T item);

	public T get(int index);

	public int size();

	public T remove(int index);

	public boolean isEmpty();

	public int indexOf(T item);

	public boolean contains(T item);

	public void replace(int index, T item);

//public Iterator<T> iterator();

	public void clear();
	public void  sort(); 
    
}
