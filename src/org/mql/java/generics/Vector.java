package org.mql.java.generics;

import java.util.Comparator;
import java.util.Iterator;

//T extends Comparable<T>
public class Vector<T> implements List<T>, Iterable<T> {
	private Object data[];

	public Vector() {
		data = new Object[0];
	}

	@Override
	public void add(T item) {
		Object tmp[] = new Object[data.length + 1];
		for (int i = 0; i < data.length; i++) {
			tmp[i] = data[i];
		}
		tmp[data.length] = item;
		data = tmp;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) data[index];
	}

	@Override
	public int size() {
		return data.length;
	}

	@Override
	public T remove(int index) {
		T item = get(index);
		Object tmp[] = new Object[size() - 1];

		for (int i = 0, j = 0; i < size(); i++) {
			if (i == index) {
				continue;
			}

			tmp[j++] = data[i];
		}

		data = tmp;
		return item;
	}

	@Override
	public boolean isEmpty() {

		return size() == 0;
	}

	@Override
	public void add(int index, T item) {
		if (item != null && index > -1) {

			Object tmp[] = new Object[size() + 1];
			for (int i = 0; i < index; i++) {
				tmp[i] = data[i];
			}
			tmp[index] = item;
			for (int i = index; i < size(); i++) {
				tmp[i + 1] = data[i];
			}

			data = tmp;
		}

	}

	@Override
	public int indexOf(T item) {
		for (int i = 0; i < size(); i++) {
			if (item.equals(data[i]))
				return i;
		}
		return -1;
	}

	@Override
	public boolean contains(T item) {
		return indexOf(item) != -1;
	}

	@Override
	public void replace(int index, T item) {
		if (index >= 0 && index < size() - 1)
			data[index] = item;

	}

	@Override
	public void clear() {
		data = new Object[0];
	}

	@SuppressWarnings("unchecked")
	@Override
	public void sort(Comparator<T> comparator) {
		int size = size();
		Object[] sortedArray = new Object[size];
		sortedArray[0] = data[0];

		for (int i = 1; i < size; ++i) {
			T itemShort = (T) data[i];
			int j = i - 1;

			while (j >= 0 && comparator.compare(itemShort, (T) sortedArray[j]) < 0) {
				sortedArray[j + 1] = sortedArray[j];
				j = j - 1;
			}

			sortedArray[j + 1] = itemShort;
		}

		data = (T[]) sortedArray;
	}
	@Override
	public boolean isSorted(Comparator<T> comparator) {
        for (int i = 0; i < size() - 1; i++) {
            T currentValue = get(i);
            T nextValue = get(i + 1);
            if (comparator.compare(currentValue, nextValue) > 0) {
                return false;
            }
        }
        return true;
    }

	
	@Override
	public Iterator<T> iterator() {
		return new VectorPoiter();
	}

	private class VectorPoiter implements Iterator<T> {
		private int currentIndex = 0;

		@Override
		public boolean hasNext() {
			return currentIndex < size();
		}

		@Override
		public T next() {
			return get(currentIndex++);
		}
	}

}
