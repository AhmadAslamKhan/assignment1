
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTest {

	@Test
	void test1() {
		Queue queue1 = new Queue();
		queue1.enqueue(1);
		queue1.enqueue(2);
		queue1.enqueue(3);
		queue1.enqueue(4);
		queue1.enqueue(5);
		
		queue1.display();
		
		assertEquals(1,queue1.dequeue());	
		assertEquals(2,queue1.dequeue());	
		assertEquals(3,queue1.dequeue());	
		
		queue1.display();
		
		queue1.dequeue();
		queue1.dequeue();
	}

	@Test
	void test2() {
		Queue queue1 = new Queue();
		queue1.enqueue(1);
		queue1.enqueue(2);
		queue1.enqueue(3);
		queue1.enqueue(4);
		queue1.enqueue(5);
		
		queue1.display();
		
		assertEquals(1,queue1.dequeue());	
		assertEquals(2,queue1.dequeue());	
		assertEquals(3,queue1.dequeue());	
		assertEquals(4,queue1.dequeue());	
		assertEquals(5,queue1.dequeue());	
		
		queue1.display();
			
	}

	@Test
	void test3() {
		Queue queue1 = new Queue();
		queue1.enqueue(1);
		queue1.enqueue(2);
		queue1.enqueue(3);
		
		queue1.display();
		
		assertNotEquals(3,queue1.dequeue());	
		assertNotEquals(1,queue1.dequeue());	
		assertNotEquals(2,queue1.dequeue());	
		
		queue1.display();
			
	}

	@Test
	void test4() {
		Queue queue1 = new Queue();
		queue1.enqueue(1);
		queue1.enqueue(2);
		queue1.enqueue(3);
		queue1.enqueue(4);
		queue1.enqueue(5);
		
		queue1.display();
		
		assertNotEquals(6,queue1.dequeue());	
		assertNotEquals(7,queue1.dequeue());	
		assertNotEquals(8,queue1.dequeue());	
		assertNotEquals(9,queue1.dequeue());	
		assertNotEquals(10,queue1.dequeue());	
		
		queue1.display();
			
	}

	@Test
	void test5() {
		Queue queue1 = new Queue();
		queue1.enqueue(2);
		queue1.enqueue(3);
		queue1.enqueue(4);
		queue1.enqueue(5);
		queue1.enqueue(6);
		
		queue1.display();
		
		assertTrue(1<queue1.dequeue());	
		assertTrue(2<queue1.dequeue());	
		assertTrue(3<queue1.dequeue());	
		assertTrue(4<queue1.dequeue());	
		assertTrue(5<queue1.dequeue());	
		
		queue1.display();
			
	}

	@Test
	void test6() {
		Queue queue1 = new Queue();
		queue1.enqueue(5);
		queue1.enqueue(6);
		queue1.enqueue(7);
		
		queue1.display();
		
		assertTrue(1<queue1.dequeue());	
		assertTrue(2<queue1.dequeue());	
		assertTrue(3<queue1.dequeue());	
		
		queue1.display();
			
	}

	@Test
	void test7() {
		Queue queue1 = new Queue();
		queue1.enqueue(2);
		queue1.enqueue(3);
		queue1.enqueue(4);
		queue1.enqueue(5);
		queue1.enqueue(6);
		
		queue1.display();
		
		assertFalse(1>queue1.dequeue());	
		assertFalse(2>queue1.dequeue());	
		assertFalse(3>queue1.dequeue());	
		assertFalse(4>queue1.dequeue());	
		assertFalse(5>queue1.dequeue());
		
		queue1.display();	
			
	}

	@Test
	void test8() {
		Queue queue1 = new Queue();
		queue1.enqueue(6);
		queue1.enqueue(7);
		queue1.enqueue(8);
		
		queue1.display();
		
		assertFalse(1>queue1.dequeue());	
		assertFalse(2>queue1.dequeue());	
		assertFalse(3>queue1.dequeue());	
		
		queue1.display();
			
	}

	@Test
	void test9() {
		Queue queue1 = new Queue();
		queue1.enqueue(1);
		queue1.enqueue(2);
		queue1.enqueue(3);
		queue1.enqueue(4);
		queue1.enqueue(5);
		
		queue1.display();
		
		assertNotNull(queue1);	

		queue1.dequeue();
		queue1.dequeue();
		queue1.dequeue();
		queue1.dequeue();
		queue1.dequeue();
		
		queue1.display();
			
	}

	@Test
	void test10() {
		Queue queue1 = new Queue();
		queue1.enqueue(1);
		queue1.enqueue(2);
		queue1.enqueue(3);
		
		queue1.display();
		
		assertNotNull(queue1);

		queue1.dequeue();
		queue1.dequeue();
		queue1.dequeue();
		
		queue1.display();
			
	}
	@Test
	void test11() {
		Queue queue1 = new Queue();
		queue1.enqueue(1);
		queue1.enqueue(2);
		queue1.enqueue(3);
		queue1.enqueue(4);
		queue1.enqueue(5);
		
		queue1.display();
		
		assertSame(1,queue1.dequeue());	
		assertSame(2,queue1.dequeue());	
		assertSame(3,queue1.dequeue());	
		
		queue1.display();
			
	}

	@Test
	void test12() {
		Queue queue1 = new Queue();
		queue1.enqueue(1);
		queue1.enqueue(2);
		queue1.enqueue(3);
		queue1.enqueue(4);
		queue1.enqueue(5);
		
		queue1.display();
		
		assertSame(1,queue1.dequeue());	
		assertSame(2,queue1.dequeue());	
		assertSame(3,queue1.dequeue());	
		assertSame(4,queue1.dequeue());	
		assertSame(5,queue1.dequeue());	
		
		queue1.display();
			
	}

	@Test
	void test13() {
		Queue queue1 = new Queue();
		queue1.enqueue(1);
		queue1.enqueue(2);
		queue1.enqueue(3);
		
		queue1.display();
		
		assertNotSame(3,queue1.dequeue());	
		assertNotSame(1,queue1.dequeue());	
		assertNotSame(2,queue1.dequeue());	
		
		queue1.display();
			
	}

	@Test
	void test14() {
		Queue queue1 = new Queue();
		queue1.enqueue(1);
		queue1.enqueue(2);
		queue1.enqueue(3);
		queue1.enqueue(4);
		queue1.enqueue(5);
		
		queue1.display();
		
		assertNotSame(6,queue1.dequeue());	
		assertNotSame(7,queue1.dequeue());	
		assertNotSame(8,queue1.dequeue());	
		assertNotSame(9,queue1.dequeue());	
		assertNotSame(10,queue1.dequeue());	
		
		queue1.display();
			
	}
}
