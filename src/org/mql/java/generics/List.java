package org.mql.java.generics;

import java.util.Comparator;

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

	public void clear();

	public void sort(Comparator<T> comparator);

	public boolean isSorted(Comparator<T> comparator);

}
