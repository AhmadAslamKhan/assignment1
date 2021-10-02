
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void test1() {
		LinkedList list = new LinkedList();
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		list.pushFront(5);
		
		list.display();
		
		int [] arr = {1,2,3,4,5};
		
		for (int i=4;i>=0;i--)
		{
			assertEquals(arr[i],list.head.key);
			list.popFront();
		}
		
		list.display();
		list.popFront();
	}

	@Test
	void test2() {
		LinkedList list = new LinkedList();
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		
		list.display();
		
		int [] arr = {3};
		
		for (int i=0;i<3;i++)
		{
			assertEquals(arr[0],list.head.key);
			list.popBack();
		}
		
		list.display();
		list.popBack();
	}

	@Test
	void test3() {
		LinkedList list = new LinkedList();
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		
		list.display();
		
		int [] arr = {1,2,3,4,5};
		
		for (int i=0;i<5;i++)
		{
			assertEquals(arr[i],list.head.key);
			list.popFront();
		}
		
		list.display();
		list.popFront();
	}

	@Test
	void test4() {
		LinkedList list = new LinkedList();
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		
		list.display();
		
		int [] arr = {1};
		
		for (int i=0;i<3;i++)
		{
			assertEquals(arr[0],list.head.key);
			list.popBack();
		}
		
		list.display();
		list.popBack();
	}

	@Test
	void test5() {
		LinkedList list = new LinkedList();
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		list.pushFront(5);
		
		list.display();
		
		int [] arr = {5,4,2,3,1};
		
		for (int i=4;i>=0;i--)
		{
			assertNotEquals(arr[i],list.head.key);
			list.popFront();
		}
		
		list.display();
		list.popFront();
	}

	@Test
	void test6() {
		LinkedList list = new LinkedList();
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		
		list.display();
		
		int [] arr = {1};
		
		for (int i=0;i<3;i++)
		{
			assertNotEquals(arr[0],list.head.key);
			list.popBack();
		}
		
		list.display();
		list.popBack();
	}

	@Test
	void test7() {
		LinkedList list = new LinkedList();
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		
		list.display();
		
		int [] arr = {5,4,2,3,1};
		
		for (int i=0;i<5;i++)
		{
			assertNotEquals(arr[i],list.head.key);
			list.popFront();
		}
		
		list.display();
		list.popFront();
	}

	@Test
	void test8() {
		LinkedList list = new LinkedList();
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		
		list.display();
		
		int [] arr = {3};
		
		for (int i=0;i<3;i++)
		{
			assertNotEquals(arr[0],list.head.key);
			list.popBack();
		}
		
		list.display();
		list.popBack();
	}

	@Test
	void test9() {
		LinkedList list = new LinkedList();
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		list.pushFront(5);
		list.pushFront(6);
		
		list.display();
		
		int [] arr = {1,2,3,4,5};
		
		for (int i=4;i>=0;i--)
		{
			assertTrue(arr[i]<list.head.key);
			list.popFront();
		}
		
		list.display();
		list.popFront();
	}

	@Test
	void test10() {
		LinkedList list = new LinkedList();
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		
		list.display();
		
		int [] arr = {1};
		
		for (int i=0;i<3;i++)
		{
			assertTrue(arr[0]<list.head.key);
			list.popBack();
		}
		
		list.display();
		list.popBack();
	}

	@Test
	void test11() {
		LinkedList list = new LinkedList();
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		list.pushBack(6);
		
		list.display();
		
		int [] arr = {1,2,3,4,5};
		
		for (int i=0;i<5;i++)
		{
			assertTrue(arr[i]<list.head.key);
			list.popFront();
		}
		
		list.display();
		list.popFront();
	}

	@Test
	void test12() {
		LinkedList list = new LinkedList();
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		
		list.display();
		
		int [] arr = {1};
		
		for (int i=0;i<3;i++)
		{
			assertTrue(arr[0]<list.head.key);
			list.popBack();
		}
		
		list.display();
		list.popBack();
	}


	@Test
	void test13() {
		LinkedList list = new LinkedList();
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		
		list.display();
		
		int [] arr = {3};
		
		for (int i=0;i<3;i++)
		{
			assertNotEquals(arr[0],list.head.key);
			list.popBack();
		}
		
		list.display();
		list.popBack();
	}

	@Test
	void test14() {
		LinkedList list = new LinkedList();
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		
		list.display();
		
		list.pop(1);
		assertEquals(2,list.size);

		list.pop(0);
		list.pop(0);
		list.display();
	}

	@Test
	void test15() {
		LinkedList list = new LinkedList();
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		list.pushFront(5);
		
		list.display();
		
		list.pop(1);
		list.pop(2);
		assertNotEquals(2,list.size);

		list.pop(0);
		list.pop(0);
		list.pop(0);
		list.display();
	}

	@Test
	void test16() {
		LinkedList list = new LinkedList();
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		list.pushFront(5);
		
		list.display();
		
		list.pop(3);
		list.pop(2);
		list.pop(1);
		
		assertSame(2,list.size);

		list.pop(0);
		list.pop(0);
		list.display();
	}

	@Test
	void test17() {
		LinkedList list = new LinkedList();
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		list.pushFront(5);
		
		list.display();
		
		list.pop(3);
		list.pop(2);
		list.pop(1);
		assertNotSame(3,list.size);
		

		list.pop(0);
		list.pop(0);
		list.display();
	}


}
