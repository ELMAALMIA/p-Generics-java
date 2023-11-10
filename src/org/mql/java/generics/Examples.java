package org.mql.java.generics;

import java.util.Iterator;

public class Examples {

	public Examples() {
		exp04();
	}

	void exp01() {
		List<Object> data = new Vector<>();
		data.add("Une chaîne");
		data.add(20);
		data.add(12.5);

		System.out.println(data.size());
		int e = (int) data.get(1);
		System.out.println("e = " + e);
	}

	void exp02() {
		List<Double> data = new Vector<>();
		data.add(17.56);
		data.add(20.);
		data.add(12.5);
		for (int i = 0; i < data.size(); i++) {
			System.out.println("data"+data.get(i));
		}
		System.out.println("************");

		double e = data.remove(1);
		System.out.println(data.size());
		for (int i = 0; i < data.size(); i++) {
			System.out.println("data"+data.get(i));
		}
	}
	void exp04() {
		List<Double> data = new Vector<>();
		data.add(17.56);
		data.add(20.);
		data.add(1,12.5);
		for (int i = 0; i < data.size(); i++) {
			System.out.println("data"+data.get(i));
		}
		System.out.println("****** after replace inde******");

		data.replace(1,18.5);
		System.out.println(data.size());
		for (int i = 0; i < data.size(); i++) {
			System.out.println("data"+data.get(i));
		}
	}

	void exp03() {
		List<Double> data = new LinkedList<>();
		data.add(17.56);
		data.add(20.);
		data.add(12.5);

		System.out.println(data.size());
		double e = data.get(0);
		System.out.println("e = " + e);
	}

	public static void main(String[] args) {
		new Examples();
	}

}
