
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTest {

	@Test
	void test1() {
				Array array = new Array();
				array.insert(0, 0);
				array.insert(1, 0);
				array.insert(2, 0);
				array.insert(3, 0);
				array.insert(4, 0);
				
				array.display();
				
				array.delete(0);
				int [] arr1= {3,2,1,0};
				
				for (int i=0;i<4;i++)
				{
					assertEquals(arr1[i],array.array[i]);
				}
				
	}

	@Test
	void test2() {
				Array array = new Array();
				array.insert(0, 0);
				array.insert(1, 1);
				array.insert(2, 2);
				array.insert(3, 3);
				array.insert(4, 4);
				
				array.display();

				array.delete(0);
				int [] arr1= {2,3,4,5};
				
				for (int i=0;i<4;i++)
				{
					assertNotEquals(arr1[i],array.array[i]);
				}
				
	}

	@Test
	void test3() {
				Array array = new Array();
				array.insert(3, 0);
				array.insert(4, 1);
				array.insert(5, 2);
				array.insert(6, 3);
				array.insert(7, 4);
				
				array.display();

				array.delete(0);
				int [] arr1= {2,3,4,5};
				
				for (int i=0;i<4;i++)
				{
					assertTrue(arr1[i]<array.array[i]);
				}
				
	}

	@Test
	void test4() {
				Array array = new Array();
				array.insert(1, 0);
				array.insert(2, 0);
				array.insert(3, 0);
				array.insert(4, 0);
				
				assertNotNull(array.array);
				
	}

	@Test
	void test5() {
				Array array = new Array();
				array.insert(1, 0);
				array.insert(2, 1);
				array.insert(3, 2);
				
				assertEquals(true,array.linearSearch(2));
				
	}

	@Test
	void test6() {
				Array array = new Array();
				array.insert(1, 0);
				array.insert(2, 1);
				array.insert(3, 2);
				
				assertEquals(false,array.linearSearch(4));
				
	}

	@Test
	void test7() {
				Array array = new Array();
				array.insert(5, 0);
				array.insert(4, 1);
				array.insert(3, 2);
				array.insert(2, 3);
				array.insert(1, 4);
				
				array.bubbleSort();
				

				int [] arr1= {1,2,3,4,5};
				
				for (int i=0;i<5;i++)
				{
					assertEquals(arr1[i],array.array[i]);
				}
				
	}

	@Test
	void test8() {
				Array array = new Array();
				array.insert(1, 0);
				array.insert(2, 1);
				array.insert(3, 2);
				array.insert(4, 3);
				array.insert(5, 4);
				
				assertEquals(true,array.binarySearch(3,0,4));
				assertEquals(true,array.binarySearch(1,0,4));
				assertEquals(true,array.binarySearch(4,0,4));
				
	}

	@Test
	void test9() {
				Array array = new Array();
				array.insert(1, 0);
				array.insert(2, 1);
				array.insert(3, 2);
				array.insert(4, 3);
				array.insert(5, 4);
				
				assertEquals(false,array.binarySearch(6,0,4));
				assertEquals(false,array.binarySearch(7,0,4));
				assertEquals(false,array.binarySearch(8,0,4));
				
	}


	
}