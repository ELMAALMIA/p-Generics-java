package org.mql.java.generics.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mql.java.generics.LinkedList;
import org.mql.java.generics.List;

class LinkedListTest {

	
	// get and add function
    @Test
    void testLinkedListGet() {
        List<Double> list = new LinkedList<Double>();
        list.add(10.5);
        list.add(20.0);
        list.add(30.75);

        assertEquals(10.5, list.get(0));
        assertEquals(20.0, list.get(1));
        assertEquals(30.75, list.get(2));
    }

    
    // size test
    @Test
    void testLinkedListSize() {
        List<Double> list = new LinkedList<>();
        assertEquals(0, list.size());

        list.add(15.5);
        list.add(25.0);
        list.add(35.75);

        assertEquals(3, list.size());
    }

    // remove item with index
    @Test
    void testLinkedListRemove() {
        List<Double> list = new LinkedList<>();
        list.add(5.0);
        list.add(10.0);
        list.add(15.0);

        assertEquals(10.0, list.remove(1));
        assertEquals(2, list.size());
        assertEquals(15.0, list.get(1));
    }

    // add with index
//    @Test
//    void testLinkedListAddByIndex() {
//        List<Double> list = new LinkedList<>();
//        list.add(5.0);
//        list.add(15.0);
//        list.add(25.0);
//
//        list.add(1, 10.0);
//
//        assertEquals(10.0, list.get(1));
//        assertEquals(15.0, list.get(2));
//    }

    
    //index of element
    @Test
    void testLinkedListIndexOf() {
        List<Double> list = new LinkedList<>();
        list.add(10.0);
        list.add(20.0);
        list.add(30.0);

        assertEquals(1, list.indexOf(20.0));
        assertEquals(-1, list.indexOf(40.0));
    }

    // test linkedlist contains an element
    @Test
    void testLinkedListContains() {
        List<Double> list = new LinkedList<>();
        list.add(10.0);
        list.add(20.0);
        list.add(30.0);

        assertTrue(list.contains(20.0));
        assertFalse(list.contains(40.0));
    }

    // test replace function
    @Test
    void testLinkedListReplace() {
        List<Double> list = new LinkedList<>();
        list.add(5.0);
        list.add(10.0);
        list.add(15.0);

        list.replace(1, 7.5);

        assertEquals(7.5, list.get(1));
    }

    
    // clear linked list
    @Test
    void testLinkedListClear() {
        List<Double> list = new LinkedList<>();
        list.add(10.0);
        list.add(20.0);
        list.add(30.0);

        list.clear();

        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }
    // short element 

//    @Test
//    void testLinkedListSort() {
//        List<Double> list = new LinkedList<>();
//        list.add(30.0);
//        list.add(10.0);
//        list.add(20.0);
//
//        list.sort();
//
//        assertEquals(10.0, list.get(0));
//        assertEquals(20.0, list.get(1));
//        assertEquals(30.0, list.get(2));
//    }
}
